package br.senac.juridico.model;

import java.io.Serializable;
import jakarta.persistence.*;

@Entity
public class Usuario implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "usuario_id", nullable = false)
	private int id;
	@Column(name = "usuario_cpf", nullable = false)
	private String cpf;
	@Column(name = "usuario_nome_completo", nullable = false)
	private String nomeCompleto;
	@Column(name = "usuario_tipo", nullable = false)
	private int tipo;
	@Column(name = "usuario_status", nullable = false)
	private int status;	
	
	@ManyToOne
	@JoinColumn(name = "empresa_id")
	private Empresa empresa;

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public String getNomeCompleto() {
		return nomeCompleto;
	}
	public void setNomeCompleto(String nomeCompleto) {
		this.nomeCompleto = nomeCompleto;
	}
	public int getTipo() {
		return tipo;
	}
	public void setTipo(int tipo) {
		this.tipo = tipo;
	}
	public int getStatus() {
		return status;
	}
	public void setStatus(int status) {
		this.status = status;
	}	

	public Empresa getEmpresa() {
		return empresa;
	}
	public void setEmpresa(Empresa empresa) {
		this.empresa = empresa;
	}
}
