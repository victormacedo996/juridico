package br.senac.juridico.model;

import java.io.Serializable;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "atendimento_registro_envolvido")
public class AtendimentoRegistroEnvolvido implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -8006299626149020540L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "atendimento_registro_envolvido_id", nullable = false)
	private Integer id;

	@Column(name = "atendimento_registro_envolvido_nome", nullable = false)
	private String nome;

	@Column(name = "atendimento_registro_envolvido_email", nullable = false)
	private String email;

	@Column(name = "atendimento_registro_envolvido_status")
	private int status;

	//@ManyToMany????????????
	@ManyToOne
	@JoinColumn(name = "atendimento_registro_id")
	private AtendimentoRegistro atendimentoRegistro;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getStatus() {
		return status;
	}

	public void setStatus(int status) {
		this.status = status;
	}

	public AtendimentoRegistro getAtendimentoRegistro() {
		return atendimentoRegistro;
	}

	public void setAtendimentoRegistro(AtendimentoRegistro atendimentoRegistro) {
		this.atendimentoRegistro = atendimentoRegistro;
	}

}