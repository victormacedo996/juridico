import { Component, EventEmitter, Input, OnInit, Output } from '@angular/core';
import { NgSelectConfig } from '@ng-select/ng-select';
import { analiseJuridico } from 'src/app/models/analiseJuridico';
import { requisicaoTemplate } from 'src/app/models/requisicaoTemplate';
import { tipoSolicitacao } from 'src/app/models/tipoSolicitacao';

@Component({
  selector: 'app-cadastro-requisicao',
  templateUrl: './cadastro-requisicao.component.html',
  styleUrls: ['./cadastro-requisicao.component.css']
})
export class CadastroRequisicaoComponent implements OnInit {
  @Input() params: any;
  @Output() onCloseModal: EventEmitter<boolean> = new EventEmitter<boolean>();
  @Output() onSave: EventEmitter<analiseJuridico> = new EventEmitter<analiseJuridico>();
  tipoSolicitacao: Array<tipoSolicitacao> = new Array<tipoSolicitacao>();
  requisicaoTemplate: Array<requisicaoTemplate> = new Array<requisicaoTemplate>();
  analiseJuridico: analiseJuridico = new analiseJuridico();
  prioridade: any;

  constructor(private config: NgSelectConfig) {
    this.config.notFoundText = 'Custom not found';
    this.config.bindValue = 'value';
  }

  ngOnInit(): void {
    this.bindValues()
    this.criarEnumPrioridade()
  }
  //Faz o bind dos valores recebidos do componente requisicao.component com variáveis do componente
  bindValues() {
    this.tipoSolicitacao = this.params.tipoSolicitacao;
    this.requisicaoTemplate = this.params.requisicaoTemplate;
  }
  //Cria enum para a propriedade prioridade da classe analiseJuridico
  criarEnumPrioridade() {
    this.prioridade = [
      { id: 1, name: 'Baixa' },
      { id: 2, name: 'Média' },
      { id: 3, name: 'Alta' },
    ]
  }
  //emite evento para fechar a modal
  closeModal() {
    this.onCloseModal.emit(false);
  }
  //valida as condições para salvar o formulário
  validarCondicoes() {
    let validator = this.verifyFields(this.analiseJuridico)
    validator ? this.salvarRequisicao() : this.mensagemCampoVazio();
  }
  //verifica se todos os campos estão preenchidos e retorna boolean
  verifyFields(requisicao: analiseJuridico): boolean {
    let campos = [requisicao.titulo, requisicao.tipoSolicitacao, requisicao.prioridade];
    for (let campo of campos) {
      //verificação para null e para string vazia
      if (campo == null || !Boolean(campo)) { return false; }
    }
    return true;
  }
  //passa os dados da requisicao para o componente pai
  salvarRequisicao() {
    this.onSave.emit(this.analiseJuridico);
    this.closeModal()
  }
  //exibe mensagem de feedback para o usuário
  mensagemCampoVazio() {
    alert('atenção, algum campo está vazio. Refaça o processo')
  }
}
