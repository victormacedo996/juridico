package br.senac.juridico.model;

import java.io.Serializable;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="solicitacao_tipo")
public class SolicitacaoTipo implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -5507463468659579142L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "solicitacao_tipo_id", nullable = false)
	private Integer id;
	
	@Column(name = "solicitacao_tipo_descricao", nullable = false)
	private String descricao;
	
	@Column(name = "solicitacao_tipo_prazo", nullable = false)
	private int prazo;
	
	@Column(name = "solicitacao_tipo_status", nullable = false)
	private int status;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public int getPrazo() {
		return prazo;
	}

	public void setPrazo(int prazo) {
		this.prazo = prazo;
	}

	public int getStatus() {
		return status;
	}

	public void setStatus(int status) {
		this.status = status;
	}
	
	
	
	
}
