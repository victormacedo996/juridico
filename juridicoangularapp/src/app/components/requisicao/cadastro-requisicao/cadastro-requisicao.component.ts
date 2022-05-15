import { Component, EventEmitter, Input, OnInit, Output } from '@angular/core';
import { NgSelectConfig } from '@ng-select/ng-select';
import { requisicaoTemplate } from 'src/app/models/requisicaoTemplate';
import { tipoSolicitacao } from 'src/app/models/tipoSolicitacao';

@Component({
  selector: 'app-cadastro-requisicao',
  templateUrl: './cadastro-requisicao.component.html',
  styleUrls: ['./cadastro-requisicao.component.css']
})
export class CadastroRequisicaoComponent implements OnInit {
  @Input() params:any;
  tipoSolicitacao:Array<tipoSolicitacao> = new Array<tipoSolicitacao>();
  requisicaoTemplate:Array<requisicaoTemplate> = new Array<requisicaoTemplate>();
  titulo: string = ""
  tipoSolicitacaoSelecionado: string = ""
  requisitoSolicitacaoSelecionado: string = ""
  requisitoTemplate: string = ""
  analiseEncerramento: string = ""
  prioridadeProcesso: string = ""
  observacao: string = ""

  constructor(private config: NgSelectConfig) { 
    this.config.notFoundText = 'Custom not found';
    // set the bindValue to global config when you use the same 
    // bindValue in most of the place. 
    // You can also override bindValue for the specified template 
    // by defining `bindValue` as property
    // Eg : <ng-select bindValue="some-new-value"></ng-select>
    this.config.bindValue = 'value';
  }
  @Output() onCloseModal: EventEmitter<boolean> = new EventEmitter<boolean>();

  ngOnInit(): void {
    console.log(this.params)
    this.bindValues()
  }
  bindValues(){
    debugger;
    this.tipoSolicitacao = this.params.tipoSolicitacao;
    this.requisicaoTemplate = this.params.requisicaoTemplate;
  }
  closeModal(){
    this.onCloseModal.emit(false);
  }
  salvar(){
    alert(this.titulo)
    this.closeModal()
  }

}
