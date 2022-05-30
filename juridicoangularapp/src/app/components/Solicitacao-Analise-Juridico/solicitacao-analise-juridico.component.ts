import { Component, OnInit } from '@angular/core';
import { FormBuilder } from '@angular/forms';
import { forkJoin, map } from 'rxjs';
import { soliocitacaoAnaliseJuridico } from 'src/app/models/solocitacaoAnaliseJuridico';
import { PrioridadeService } from 'src/app/services/requisicao/prioridade.service';
import { TipoSolicitacaoService } from 'src/app/services/requisicao/tipo-solicitacao.service';

@Component({
  selector: 'app-solicitacao-analise-juridico',
  templateUrl: './solicitacao-analise-juridico.component.html',
  styleUrls: ['./solicitacao-analise-juridico.component.css']
})
export class SolicitacaoAnaliseJuridicoComponent implements OnInit {

  constructor(private tipoSolicitacao:TipoSolicitacaoService,private prioridadeService:PrioridadeService, private formBuilder: FormBuilder,) { }
  params:any;
  tipoSolicitacaoParams:any;
  prioridadeParams:any;
  solicitacaoAnaliseJuridico:soliocitacaoAnaliseJuridico = new soliocitacaoAnaliseJuridico;
  /**
   * propriedades auxiliares que fazem bind no formulário
   */
  tipoSolicitacaoId?:number;
  prioridadeId?:number;

  formulario:any;
  ngOnInit(): void {
    this.carregarParametros();
  }
  carregarParametros(){
    //Faz requisição para todas as apis responsáveis pela exibição inicial da tela de uma só vez
    let response = forkJoin([
      this.tipoSolicitacao.buscarTipoSolicitacao(),
      this.prioridadeService.buscarPrioridade()
    ]).pipe(
      map(([tipoSolicitacao,prioridadeService]) => {
        return { tipoSolicitacao,prioridadeService};
      })
    );

    response.subscribe(
      (response) => {
        //vários objetos são salvos nessa variável
        //variável que é passada para a modal para carregar alguns dados
        debugger;
        this.params = response;
        this.tipoSolicitacaoParams = response.tipoSolicitacao;
        this.prioridadeParams = response.prioridadeService;
      },
      (error) => {
        alert('não foi possível carregar os dados, recarregue a página')
      }
    );
  }

  Salvar(){
    this.solicitacaoAnaliseJuridico.tipoSolicitacao = this.tipoSolicitacaoId
    this.solicitacaoAnaliseJuridico.prioridade = this.prioridadeId
    console.log(this.solicitacaoAnaliseJuridico)
  }
}
