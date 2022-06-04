import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { FiltrarService } from 'src/app/services/filtrar.service';

@Component({
  selector: 'app-consultar',
  templateUrl: './consultar.component.html',
  styleUrls: ['./consultar.component.css']
})
export class ConsultarComponent implements OnInit {

  esculapio:boolean = false;
  numeroSolicitacao:String= ""
  constructor(private filtrarService:FiltrarService,private router:Router) { }

  ngOnInit(): void {
  }
filtrar(){
  this.filtrarService.filtrar(this.numeroSolicitacao).subscribe()

}
callEsculapio(){
  this.esculapio = !this.esculapio
}
}
