import { Component, OnInit } from '@angular/core';
import { RegistroAnaliseAtendimento } from 'src/app/models/RegistroAnaliseAtendimento';
import { AtendimentoRegistroService } from 'src/app/services/atendimento-registro.service';


export interface PeriodicElement {
  name: string;
  position: number;
  weight: number;
  symbol: string;
}

const ELEMENT_DATA: PeriodicElement[] = [
  {position: 1, name: 'Hydrogen', weight: 1.0079, symbol: 'H'},
  {position: 2, name: 'Helium', weight: 4.0026, symbol: 'He'},
  {position: 3, name: 'Lithium', weight: 6.941, symbol: 'Li'},
  {position: 4, name: 'Beryllium', weight: 9.0122, symbol: 'Be'},
  {position: 5, name: 'Boron', weight: 10.811, symbol: 'B'},
];

@Component({
  selector: 'app-registro-analise-atendimento',
  templateUrl: './registro-analise-atendimento.component.html',
  styleUrls: ['./registro-analise-atendimento.component.css']
})
export class RegistroAnaliseAtendimentoComponent implements OnInit {

  displayedColumns: string[] = ['position', 'name', 'weight', 'symbol'];
  dataSource = ELEMENT_DATA;


  constructor(private atendimentoService:AtendimentoRegistroService) { }

  ngOnInit(): void {
  }

  atendimento:RegistroAnaliseAtendimento = new RegistroAnaliseAtendimento()

  cadastrar(){
    this.atendimentoService.cadastrarRegistro(this.atendimento)
  }

}
