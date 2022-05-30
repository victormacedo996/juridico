/* Componente responsavel por criar uma requisicao de análise de solicitacao
   Esse componente terá subcomponentes que serão modais
   Essas modais irão chamar um serviço que enviará os dados para o back-end
   A controller que receberá esses dados no back-end será a AnaliseJuridicoController.java
*/
import { Component, Input, OnInit } from '@angular/core';
import { CarregarParametrosRequisicaoService } from 'src/app/services/requisicao/carregar-parametros-requisicao.service';
import { RequisitoTemplateService } from 'src/app/services/requisicao/requisito-template.service';
import { TipoSolicitacaoService } from 'src/app/services/requisicao/tipo-solicitacao.service';
import { forkJoin, map } from 'rxjs';
import { RequisicaoService } from 'src/app/services/requisicao/requisicao.service';
import { soliocitacaoAnaliseJuridico } from 'src/app/models/solocitacaoAnaliseJuridico';

@Component({
  selector: 'app-requisicao',
  templateUrl: './requisicao.component.html',
  styleUrls: ['./requisicao.component.css']
})
export class RequisicaoComponent implements OnInit {
  showModal = false;
  params:any;
  analiseJuridicoDaModal:soliocitacaoAnaliseJuridico = new soliocitacaoAnaliseJuridico();
  constructor(
    private tipoSolicitacao:TipoSolicitacaoService,
    private requisitoTemplate:RequisitoTemplateService,
    private requisicaoService:RequisicaoService
    ) { }

  ngOnInit(): void {
    this.carregarParametros();
  }

  carregarParametros(){
    //Faz requisição para todas as apis responsáveis pela exibição inicial da tela de uma só vez
    let response = forkJoin([
      this.tipoSolicitacao.buscarTipoSolicitacao(),
      this.requisitoTemplate.buscarRequisitoTemplate(),
    ]).pipe(
      map(([tipoSolicitacao, requisicaoTemplate]) => {
        return { tipoSolicitacao, requisicaoTemplate };
      })
    );

    response.subscribe(
      (response) => {
        //vários objetos são salvos nessa variável
        //variável que é passada para a modal para carregar alguns dados
        this.params = response;
      },
      (error) => {
        alert('não foi possível carregar os dados, recarregue a página')
      }
    );
  }
  exibirModal(){
    this.showModal = !this.showModal
  }
  fecharModal(event:boolean){
    this.showModal = event;
  }
  //passa os dados para o serviço realizar o post
  salvarRequisicao(event:soliocitacaoAnaliseJuridico){
    this.requisicaoService.criarRequisicao(event).subscribe(response => {
    },error => {

    }, ()=>{})
  }
}
