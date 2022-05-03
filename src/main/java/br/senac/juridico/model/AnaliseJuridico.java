package br.senac.juridico.model;

import java.io.Serializable;
import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

public class AnaliseJuridico implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "solicitacao_analise_id", nullable = false)
	private int Id;
	
	@Column(name = "solicitacao_analise_numero", nullable = false)
	private int AnaliseNumero;
	
	@Column(name = "solicitacao_analise_data_registro", nullable = false)
	private Date AnaliseDataRegistro;
	
	@Column(name = "solicitacao_analise_titulo", nullable = false)
	private String Titulo;
	
	@Column(name = "solicitacao_analise_observacao")
	private String Observacao;
	
	@Column(name = "solicitacao_analise_status", nullable = false)
	private int Status;
	
	@ManyToOne
	@JoinColumn(name = "usuario_id")
	private Usuario usuario;
	
	@ManyToOne
	@JoinColumn(name = "solicitacao_tipo_id")
	private TipoSolicitacao tipoSolicitacao;
	
	public int getAlalise() {
		return Id;
	}
	public void setAlalise(int id) {
		Id = id;
	}
	public int getAnaliseNumero() {
		return AnaliseNumero;
	}
	public void setAnaliseNumero(int analiseNumero) {
		AnaliseNumero = analiseNumero;
	}
	public Date getAnaliseDataRegistro() {
		return AnaliseDataRegistro;
	}
	public void setAnaliseDataRegistro(Date analiseDataRegistro) {
		AnaliseDataRegistro = analiseDataRegistro;
	}
	public String getTitulo() {
		return Titulo;
	}
	public void setTitulo(String titulo) {
		Titulo = titulo;
	}
	public String getObservacao() {
		return Observacao;
	}
	public void setObservacao(String observacao) {
		Observacao = observacao;
	}
	public int getStatus() {
		return Status;
	}
	public void setStatus(int status) {
		Status = status;
	}
	
}
