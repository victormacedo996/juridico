package br.senac.juridico.model;

import java.io.Serializable;
import java.util.Date;

import jakarta.persistence.*;

@Entity
public class SolicitacaoAnaliseJuridico implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "solicitacao_analise_id", nullable = false)
	private int id;
	
	@Column(name = "solicitacao_analise_numero", nullable = false)
	private int numero;
	
	@Column(name = "solicitacao_analise_dataRegistro", nullable = false)
	private Date dataRegistro;
	
	@Column(name = "solicitacao_analise_titulo", nullable = false)
	private String titulo;
	
	@Column(name = "solicitacao_analise_observacao", nullable = true)
	private String observacao;	
	
	@Column(name = "solicitacao_analise_status", nullable = false)
	private int status;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public Date getDataRegistro() {
		return dataRegistro;
	}

	public void setDataRegistro(Date dataRegistro) {
		this.dataRegistro = dataRegistro;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getObservacao() {
		return observacao;
	}

	public void setObservacao(String observacao) {
		this.observacao = observacao;
	}

	public int getStatus() {
		return status;
	}

	public void setStatus(int status) {
		this.status = status;
	}
	
}
