package br.senac.juridico.model;

import java.io.Serializable;

import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

public class TipoSolicitacao implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "solicitacao_tipo_id", nullable = false)
	private int Id;
	
	@Column(name = "solicitacao_tipo_descricao", nullable = false)
	private String Descricao;
	
	@Column(name = "solicitacao_tipo_prazo", nullable = false)
	private int TipoPrazo;
	
	@Column(name = "solicitacao_tipo_status", nullable = false)
	private int TipoStatus;
	
	
	
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
	public int getTipoPrazo() {
		return TipoPrazo;
	}
	public void setTipoPrazo(int tipoPrazo) {
		TipoPrazo = tipoPrazo;
	}
	public int getTipoStatus() {
		return TipoStatus;
	}
	public void setTipoStatus(int tipoStatus) {
		TipoStatus = tipoStatus;
	}
}
