package br.senac.juridico.model;

import java.io.Serializable;

import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

public class TipoRequisito implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "solicitacao_tipo_requisito_id", nullable = false)
	private int Id;
	
	@Column(name = "solicitacao_tipo_requisito_descricao", nullable = false)
	private String Descricao;
	
	@Column(name = "solicitacao_tipo_requisito_status", nullable = false)
	private int Status;
	
	@Column(name = "solicitacao_tipo_requisito_campo", nullable = false)
	private int TipoCampo;
	
	@ManyToOne
	@JoinColumn(name = "solicitacao_tipo_id")
	private TipoSolicitacao tipoSolicitacao;
	
	@ManyToOne
	@JoinColumn(name = "solicitacao_tipo_requisito_id")
	private RequisitoTemplate requisitoTemplate;
	
	public int getId() {
		return Id;
	}
	public void setId(int id) {
		Id = id;
	}
	public String getDescricao() {
		return Descricao;
	}
	public void setDescricao(String descricao) {
		Descricao = descricao;
	}
	public int getStatus() {
		return Status;
	}
	public void setStatus(int status) {
		Status = status;
	}
	public int getTipoCampo() {
		return TipoCampo;
	}
	public void setTipoCampo(int tipoCampo) {
		TipoCampo = tipoCampo;
	}
	
}
