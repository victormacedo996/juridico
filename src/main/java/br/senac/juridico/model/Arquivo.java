package br.senac.juridico.model;

import org.hibernate.type.BlobType;

public class Arquivo {
	private int Id;
	private String Nome;
	private String Mds;
	private BlobType Blob;
	private String Extensao;
	private int status;
	
	public int getId() {
		return Id;
	}
	public void setId(int id) {
		Id = id;
	}
	public String getNome() {
		return Nome;
	}
	public void setNome(String nome) {
		Nome = nome;
	}
	public String getMds() {
		return Mds;
	}
	public void setMds(String mds) {
		Mds = mds;
	}
	public BlobType getBlob() {
		return Blob;
	}
	public void setBlob(BlobType blob) {
		Blob = blob;
	}
	public String getExtensao() {
		return Extensao;
	}
	public void setExtensao(String extensao) {
		Extensao = extensao;
	}
	public int getStatus() {
		return status;
	}
	public void setStatus(int status) {
		this.status = status;
	}
	
}
