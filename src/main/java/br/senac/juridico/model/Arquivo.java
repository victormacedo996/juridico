package br.senac.juridico.model;

import java.io.Serializable;

import org.hibernate.type.BlobType;

import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

public class Arquivo implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "arquivo_id", nullable = false)
	private int Id;
	
	@Column(name = "arquivo_nome", nullable = false)
	private String Nome;
	
	@Column(name = "arquivo_md5", nullable = false)
	private String Md5;
	
	@Column(name = "arquivo_blob", nullable = false)
	private BlobType Blob;
	
	@Column(name = "arquivo_extensao", nullable = false)
	private String Extensao;
	
	@Column(name = "arquivo_status", nullable = false)
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
		return Md5;
	}
	public void setMds(String mds) {
		Md5 = mds;
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
