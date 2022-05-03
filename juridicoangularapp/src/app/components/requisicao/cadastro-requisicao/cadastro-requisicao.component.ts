import { Component, EventEmitter, OnInit, Output } from '@angular/core';

@Component({
  selector: 'app-cadastro-requisicao',
  templateUrl: './cadastro-requisicao.component.html',
  styleUrls: ['./cadastro-requisicao.component.css']
})
export class CadastroRequisicaoComponent implements OnInit {

  constructor() { }
  @Output() onCloseModal: EventEmitter<boolean> = new EventEmitter<boolean>();

  ngOnInit(): void {
  }
  closeModal(){
    this.onCloseModal.emit(false);
  }
  salvar(){
    alert('criar request para api')
    this.closeModal()
  }
}
