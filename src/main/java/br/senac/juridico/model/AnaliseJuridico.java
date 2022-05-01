package br.senac.juridico.model;

import java.util.Date;

public class AnaliseJuridico {
	private int Id;
	private int AnaliseNumero;
	private Date AnaliseDataRegistro;
	private String Titulo;
	private String Observacao;
	private int Status;
	
	//private solicitacao solicitacaoTipoId;
	//private Usuario usuarioId;
	
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
