package br.senac.juridico.model;

import java.io.Serializable;
import jakarta.persistence.*;

@Entity
public class Empresa implements Serializable {
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "empresa_id", nullable = false)
	private int id;
	@Column(name = "empresa_nome", nullable = false)
	private String nome;
	@Column(name = "empresa_cnpj", nullable = false)
	private String cnpj;	
	@Column(name = "empresa_status", nullable = false)
	private int status;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCnpj() {
		return cnpj;
	}
	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}
	public int getStatus() {
		return status;
	}
	public void setStatus(int status) {
		this.status = status;
	}
	
	
}
