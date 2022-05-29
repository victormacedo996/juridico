package br.senac.juridico.model;

import java.io.Serializable;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "status_solicitacao_analise")
public class StatusSolicitacaoAnalise implements Serializable{
	private static final long serialVersionUID = -5621647006169043658L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "status_solicitacao_analise_id", nullable = false)
	private Integer id;
	
	@Column(name = "status_solicitacao_analise_descricao", nullable = false)
	private String descricao;
	
	@Column(name = "status_solicitacao_analise_status", nullable = false)
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

	public int getStatus() {
		return status;
	}

	public void setStatus(int status) {
		this.status = status;
	}

	

}
