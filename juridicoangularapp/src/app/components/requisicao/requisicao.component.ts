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

@Component({
  selector: 'app-requisicao',
  templateUrl: './requisicao.component.html',
  styleUrls: ['./requisicao.component.css']
})
export class RequisicaoComponent implements OnInit {
  showModal = false;
  params:any;
  constructor(
    private tipoSolicitacao:TipoSolicitacaoService,
    private requisitoTemplate:RequisitoTemplateService
    ) { }

  ngOnInit(): void {
    this.carregarParametros();
  }

  carregarParametros(){
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
        this.params = response;
      },
      (error) => {
        
      }
    );
  }



  exibirModal(){
    this.showModal = !this.showModal
  }

  fecharModal(event:boolean){
    this.showModal = event;
  }

}
