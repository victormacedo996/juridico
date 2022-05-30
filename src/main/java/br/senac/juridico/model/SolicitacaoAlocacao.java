package br.senac.juridico.model;

import java.io.Serializable;
import java.util.Date;

import jakarta.persistence.*;

@Entity
public class SolicitacaoAlocacao implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "solicitacao_alocacao_id", nullable = false)
	private int id;

	@Column(name = "solicitacao_alocacao_data", nullable = false)
	private Date dataRegistro;

	@Column(name = "solicitacao_alocacao_status", nullable = false)
	private int status;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Date getDataRegistro() {
		return dataRegistro;
	}

	public void setDataRegistro(Date dataRegistro) {
		this.dataRegistro = dataRegistro;
	}

	public int getStatus() {
		return status;
	}

	public void setStatus(int status) {
		this.status = status;
	}

}