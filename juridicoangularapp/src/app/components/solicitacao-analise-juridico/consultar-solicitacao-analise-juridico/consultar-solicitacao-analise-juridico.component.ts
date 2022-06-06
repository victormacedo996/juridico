import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { SolicitacaoAnaliseJuridicoService } from 'src/app/services/solicitacao-analise-juridico.service';

@Component({
  selector: 'app-consultar',
  templateUrl: './consultar-solicitacao-analise-juridico.component.html',
  styleUrls: ['./consultar-solicitacao-analise-juridico.component.css']
})
export class ConsultarSolicitacaoAnaliseJuridicoComponent implements OnInit {

  esculapio:boolean = false;
  numeroSolicitacao:String= ""
  
  constructor(
    private solicitacaoAnaliseJuridicoService:SolicitacaoAnaliseJuridicoService,
    private router:Router
  ){ }

  ngOnInit(): void {
  }

  filtrarNumeroSolicitacao(){
    this.solicitacaoAnaliseJuridicoService.filtrarNumeroSolicitacaoAnaliseJuridico(this.numeroSolicitacao).subscribe()
  }

  callEsculapio(){
    this.esculapio = !this.esculapio
  }
}