import { Component, OnInit } from '@angular/core';
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

  constructor(private tipoSolicitacao: TipoSolicitacaoService, private prioridadeService: PrioridadeService, private requisicao: RequisicaoService, private solicitacaoTipoRequisito:SolicitacaoTipoRequisitoService, private requisitoTemplate:RequisitoTemplateService) { }
  params: any;
  tipoSolicitacaoParams: any;
  prioridadeParams: any;
  solicitacaoTipoRequisitoParams:any;
  requisitoTemplateParams:any;
  solicitacaoAnaliseJuridico: soliocitacaoAnaliseJuridico = new soliocitacaoAnaliseJuridico;
  /**
   * propriedades auxiliares que fazem bind no formulário
   */
  tipoSolicitacaoId?: number;
  prioridadeId?: number;

  formulario: any;
  ngOnInit(): void {
    this.carregarParametros();
    this.loadingAlert();
  }

  loadingAlert() {
    Swal.fire(
      {
        title: 'Carregando',
        didOpen: () => {
          Swal.showLoading()
        }
      }
    )
    if(this.params){
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
        return { tipoSolicitacao, prioridadeService, solicitacaoTipoRequisito, requisitoTemplate};
      })
    );

    response.subscribe(
      (response) => {
        debugger;
        //vários objetos são salvos nessa variável
        //variável que é passada para a modal para carregar alguns dados
        this.params = response;
        this.tipoSolicitacaoParams = response.tipoSolicitacao;
        this.prioridadeParams = response.prioridadeService;
        this.solicitacaoTipoRequisitoParams = response.solicitacaoTipoRequisito;
        this.requisitoTemplateParams = response.requisitoTemplate
        //chama a função para fechar o swal
        this.loadingAlert()
      },
      (error) => {
        Swal.fire('error', 'Não foi possível carregar os dados, favor confira a sua conxão com a internet e recarregue a página', 'error')
      }
    );
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
