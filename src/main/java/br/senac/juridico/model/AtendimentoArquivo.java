package br.senac.juridico.model;

import java.io.Serializable;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "atendimento_arquivo")
public class AtendimentoArquivo implements Serializable{

	
	/**
	 * 
	 */
	private static final long serialVersionUID = 8595969509756192489L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "atendimento_arquivo_id", nullable = false)
	private Integer atendimento_arquivo;
	
	@Column(name = "atendimento_arquivo_descricao", nullable = false)
	private String arquivo_descricao;
	
	@Column(name = "atendimento_arquivo_status", nullable = false)
	private int arquivo_status;
	
	@ManyToOne
	@Column(name = "atendimento_registro_id", nullable = false)
	private AtendimentoRegistro atendimento_registro_id;
	
	//@ManyToMany???????
	@Column(name = "arquivo_id", nullable = false)
	private Arquivo arquivo_id;

	public Integer getAtendimento_arquivo() {
		return atendimento_arquivo;
	}

	public void setAtendimento_arquivo(Integer atendimento_arquivo) {
		this.atendimento_arquivo = atendimento_arquivo;
	}

	public String getArquivo_descricao() {
		return arquivo_descricao;
	}

	public void setArquivo_descricao(String arquivo_descricao) {
		this.arquivo_descricao = arquivo_descricao;
	}

	public int getArquivo_status() {
		return arquivo_status;
	}

	public void setArquivo_status(int arquivo_status) {
		this.arquivo_status = arquivo_status;
	}

	public AtendimentoRegistro getAtendimento_registro_id() {
		return atendimento_registro_id;
	}

	public void setAtendimento_registro_id(AtendimentoRegistro atendimento_registro_id) {
		this.atendimento_registro_id = atendimento_registro_id;
	}

	public Arquivo getArquivo_id() {
		return arquivo_id;
	}

	public void setArquivo_id(Arquivo arquivo_id) {
		this.arquivo_id = arquivo_id;
	}
	
	
	
	
	
	
}
