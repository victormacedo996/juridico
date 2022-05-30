package br.senac.juridico.model;

import java.io.Serializable;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name="solicitacao_analise_requisito_adicional")
public class SolicitacaoAnaliseRequisitoAdicional implements Serializable{

	private static final long serialVersionUID = 4282380446150260141L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="solicitacao_analise_requisito_adicional_id", nullable = false)
	private Integer analise_requisito_adicional_id;

	@Column(name = "solicitacao_analise_requisito_adicional_descricao", nullable = false)
	private String analise_requisito_adicional_descricao;

	@Column(name = "solicitacao_analise_requisito_adicional_conteudo", nullable = false)
	private String analise_requisito_adicional_conteudo;

	@Column(name = "solicitacao_analise_requisito_adicional_status", nullable  = false)
	private int analise_requisito_adicional_status;

	@ManyToOne
	@JoinColumn(name = "arquivo_id")
	private Arquivo arquivo_id;

	@Column(name = "solicitacao_analise_requisito_adicional_tipo_campo", nullable  = false)
	private int analise_requisito_adicional_tipo_campo;

	@ManyToOne
	@JoinColumn(name = "solicitacao_analise_id")
	private SolicitacaoAnaliseJuridico solicitacao_analise_id;

	@ManyToOne
	@JoinColumn(name = "atendimento_analise_juridico_id")
	private AtendimentoAnaliseJuridico atendimento_analise_juridico_id;

	public Integer getAnalise_requisito_adicional_id() {
		return analise_requisito_adicional_id;
	}

	public void setAnalise_requisito_adicional_id(Integer analise_requisito_adicional_id) {
		this.analise_requisito_adicional_id = analise_requisito_adicional_id;
	}

	public String getAnalise_requisito_adicional_descricao() {
		return analise_requisito_adicional_descricao;
	}

	public void setAnalise_requisito_adicional_descricao(String analise_requisito_adicional_descricao) {
		this.analise_requisito_adicional_descricao = analise_requisito_adicional_descricao;
	}

	public String getAnalise_requisito_adicional_conteudo() {
		return analise_requisito_adicional_conteudo;
	}

	public void setAnalise_requisito_adicional_conteudo(String analise_requisito_adicional_conteudo) {
		this.analise_requisito_adicional_conteudo = analise_requisito_adicional_conteudo;
	}

	public int getAnalise_requisito_adicional_status() {
		return analise_requisito_adicional_status;
	}

	public void setAnalise_requisito_adicional_status(int analise_requisito_adicional_status) {
		this.analise_requisito_adicional_status = analise_requisito_adicional_status;
	}

	public Arquivo getArquivo_id() {
		return arquivo_id;
	}

	public void setArquivo_id(Arquivo arquivo_id) {
		this.arquivo_id = arquivo_id;
	}

	public int getAnalise_requisito_adicional_tipo_campo() {
		return analise_requisito_adicional_tipo_campo;
	}

	public void setAnalise_requisito_adicional_tipo_campo(int analise_requisito_adicional_tipo_campo) {
		this.analise_requisito_adicional_tipo_campo = analise_requisito_adicional_tipo_campo;
	}

	public SolicitacaoAnaliseJuridico getSolicitacao_analise_id() {
		return solicitacao_analise_id;
	}

	public void setSolicitacao_analise_id(SolicitacaoAnaliseJuridico solicitacao_analise_id) {
		this.solicitacao_analise_id = solicitacao_analise_id;
	}

	public AtendimentoAnaliseJuridico getAtendimento_analise_juridico_id() {
		return atendimento_analise_juridico_id;
	}

	public void setAtendimento_analise_juridico_id(AtendimentoAnaliseJuridico atendimento_analise_juridico_id) {
		this.atendimento_analise_juridico_id = atendimento_analise_juridico_id;
	}


}