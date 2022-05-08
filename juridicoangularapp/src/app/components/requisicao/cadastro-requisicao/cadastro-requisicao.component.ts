import { Component, EventEmitter, OnInit, Output } from '@angular/core';

@Component({
  selector: 'app-cadastro-requisicao',
  templateUrl: './cadastro-requisicao.component.html',
  styleUrls: ['./cadastro-requisicao.component.css']
})
export class CadastroRequisicaoComponent implements OnInit {

  titulo: string = ""
  tipoSolicitacao: string = ""
  requisitoSolicitacao: string = ""
  requisitoTemplate: string = ""
  analiseEncerramento: string = ""
  prioridadeProcesso: string = ""
  observacao: string = ""

  constructor() { }
  @Output() onCloseModal: EventEmitter<boolean> = new EventEmitter<boolean>();

  ngOnInit(): void {
  }
  closeModal(){
    this.onCloseModal.emit(false);
  }
  salvar(){
    alert(this.titulo)
    this.closeModal()
  }

}
