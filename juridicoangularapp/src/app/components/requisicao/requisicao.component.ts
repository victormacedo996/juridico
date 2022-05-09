/* Componente responsavel por criar uma requisicao de análise de solicitacao 
   Esse componente terá subcomponentes que serão modais
   Essas modais irão chamar um serviço que enviará os dados para o back-end
   A controller que receberá esses dados no back-end será a AnaliseJuridicoController.java
*/
import { Component, OnInit } from '@angular/core';
import { CarregarParametrosRequisicaoService } from 'src/app/services/requisicao/carregar-parametros-requisicao.service';

@Component({
  selector: 'app-requisicao',
  templateUrl: './requisicao.component.html',
  styleUrls: ['./requisicao.component.css']
})
export class RequisicaoComponent implements OnInit {
  showModal = false;
  constructor(private carregarParametros:CarregarParametrosRequisicaoService) { }

  ngOnInit(): void {
    this.teste();
  }

  teste(){
    this.carregarParametros.carregarParametrosRequisicao().subscribe(response => {
      debugger;
      console.log(response);
    },error=> {

    })
  }

  exibirModal(){
    this.showModal = !this.showModal
  }

  fecharModal(event:boolean){
    this.showModal = event;
  }
  
}
