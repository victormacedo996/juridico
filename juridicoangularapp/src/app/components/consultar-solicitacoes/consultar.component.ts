import { Component, OnInit } from '@angular/core';
import { FiltrarService } from 'src/app/services/filtrar.service';

@Component({
  selector: 'app-consultar',
  templateUrl: './consultar.component.html',
  styleUrls: ['./consultar.component.css']
})
export class ConsultarComponent implements OnInit {

  numeroSolicitacao:String= ""
  constructor(private filtrarService:FiltrarService) { }

  ngOnInit(): void {
  }
filtrar(){
  this.filtrarService.filtrar(this.numeroSolicitacao).subscribe()

}
}
