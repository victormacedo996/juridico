import { Component, OnChanges, OnInit, SimpleChanges } from '@angular/core';
import { FormBuilder } from '@angular/forms';
import { forkJoin, map } from 'rxjs';
import { soliocitacaoAnaliseJuridico } from 'src/app/models/solocitacaoAnaliseJuridico';
import { PrioridadeService } from 'src/app/services/SolicitacaoAnaliseJuridico/prioridade.service';
import { RequisicaoService } from 'src/app/services/SolicitacaoAnaliseJuridico/requisicao.service';
import { RequisitoTemplateService } from 'src/app/services/SolicitacaoAnaliseJuridico/requisito-template.service';
import { SolicitacaoTipoRequisitoService } from 'src/app/services/SolicitacaoAnaliseJuridico/solicitacao-tipo-requisito.service';
import { TipoSolicitacaoService } from 'src/app/services/SolicitacaoAnaliseJuridico/tipo-solicitacao.service';
import Swal from 'sweetalert2';

@Component({
  selector: 'app-solicitacao-analise-juridico',
  templateUrl: './solicitacao-analise-juridico.component.html',
  styleUrls: ['./solicitacao-analise-juridico.component.css']
})
export class SolicitacaoAnaliseJuridicoComponent implements OnInit {

  constructor(private tipoSolicitacao: TipoSolicitacaoService, private prioridadeService: PrioridadeService, private requisicao: RequisicaoService, private solicitacaoTipoRequisito: SolicitacaoTipoRequisitoService, private requisitoTemplate: RequisitoTemplateService) { }

  /**
   * Propriedades que recebem os dados do back-end
   */
  params: any;
  tipoSolicitacaoParams: any;
  prioridadeParams: any;
  solicitacaoTipoRequisitoParams: any;
  requisitoTemplateParams: any;

  /**
   *Propriedade que envia o objeto para o back-end
   */
  solicitacaoAnaliseJuridico: soliocitacaoAnaliseJuridico = new soliocitacaoAnaliseJuridico;

  /**
   * propriedades auxiliares que fazem bind no formulário
   */
  tipoSolicitacaoId?: number;
  prioridadeId?: number;
  tipoRequisitoId?: number;

  ngOnInit(): void {
    this.carregarParametros();
    this.loadingAlert();
  }


  loadingAlert() {
    //dispara o swall de carregamento
    Swal.fire(
      {
        title: 'Carregando',
        didOpen: () => {
          Swal.showLoading()
        }
      }
    )
    //fecha os swall de carregamento quando os parametros são trazidos do back
    if (this.params) {
      Swal.close()
    }
  }
  carregarParametros() {
    //Faz requisição para todas as apis responsáveis pela exibição inicial da tela de uma só vez
    let response = forkJoin([
      this.tipoSolicitacao.buscarTipoSolicitacao(),
      this.prioridadeService.buscarPrioridade(),
      this.solicitacaoTipoRequisito.buscarSolicitacoesTipoRequisito(),
      this.requisitoTemplate.buscarRequisitoTemplate()
    ]).pipe(
      map(([tipoSolicitacao, prioridadeService, solicitacaoTipoRequisito, requisitoTemplate]) => {
        return { tipoSolicitacao, prioridadeService, solicitacaoTipoRequisito, requisitoTemplate };
      })
    );

    response.subscribe(
      (response) => {
        debugger;
        //armazena todos os objetos enviados pelo backend
        this.params = response;
        //armazena os objetos de tipoSolicitacao
        this.tipoSolicitacaoParams = response.tipoSolicitacao;
        //armazena os objetos de prioridade
        this.prioridadeParams = response.prioridadeService;
        //armazena os objetos de tipo requisito
        this.solicitacaoTipoRequisitoParams = response.solicitacaoTipoRequisito;
        //armazena os objetos de requisito template
        this.requisitoTemplateParams = response.requisitoTemplate
        //chama a função para fechar o swal
        this.loadingAlert()
      },
      (error) => {
        //caso o back-end não carregue os dados essa mensagem de erro é exibida
        Swal.fire('error', 'Não foi possível carregar os dados, favor confira a sua conxão com a internet e recarregue a página', 'error')
      }
    );
  }

  //Aplica regra de negócio e filta os as solicitações tipo requisito que possuem uma solicitação com o mesmo id do tipo solicitação
  filterTipoRequisitoById() {
    this.solicitacaoTipoRequisitoParams = this.params.solicitacaoTipoRequisito;
    this.solicitacaoTipoRequisitoParams = this.solicitacaoTipoRequisitoParams.filter((x:any)=> x.solicitacaoTipo.id == this.tipoSolicitacaoId)
  }

  

  Salvar() {
    this.solicitacaoAnaliseJuridico.tipoSolicitacao = this.tipoSolicitacaoId
    this.solicitacaoAnaliseJuridico.prioridade = this.prioridadeId
    this.requisicao.criarRequisicao(this.solicitacaoAnaliseJuridico).subscribe(response => {
      Swal.fire('Success', 'Solicitacao criada com sucesso!', 'success');
    }, error => {
      Swal.fire('Error', 'Error ao criar a solicitacao', 'error');
    })
  }
}
