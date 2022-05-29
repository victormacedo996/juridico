import { Component, OnInit } from '@angular/core';
import { FormGroup, FormControl } from '@angular/forms';
import { MatDialog } from '@angular/material/dialog';
import { ConfirmacaoRegistroAnaliseComponent } from '../confirmacao-registro-analise/confirmacao-registro-analise.component';


@Component({
  selector: 'app-registro-analise-atendimento',
  templateUrl: './registro-analise-atendimento.component.html',
  styleUrls: ['./registro-analise-atendimento.component.css']
})
export class RegistroAnaliseAtendimentoComponent implements OnInit {

  
  solicitacaoForm = new FormGroup({
    titulo: new FormControl(''),
    tipoSolicitacao: new FormControl('',),
    observacao: new FormControl(''),
    status: new FormControl(''),
    data: new FormControl('')
});

  constructor(
    public dialog: MatDialog

  ) { }

  ngOnInit(): void {
  }


  openDialog() {
    const dialogRef = this.dialog.open(ConfirmacaoRegistroAnaliseComponent, {
      
      width: '80%',
      height: '300px'

    });

    dialogRef.afterClosed().subscribe(result => {
      console.log(`Dialog result: ${result}`);
    });
  }
}
