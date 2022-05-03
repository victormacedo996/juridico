package br.senac.juridico.model;

import java.io.Serializable;

import org.springframework.format.annotation.DateTimeFormat;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "atendimento_registro")
public class AtendimentoRegistro implements Serializable{

	
	/**
	 * 
	 */
	private static final long serialVersionUID = 6856322142045337276L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "atendimento_registro_id", nullable = false)
	private Integer id;
	
	@Column(name = "atendimento_registro_observacao", nullable = false)
	private String observacao;
	
	@Column(name = "atendimento_registro_data", nullable = false)
	private DateTimeFormat dataRegistro;
	
	@Column(name = "atendimento_registro_status", nullable = false)
	private int status;
	
	@OneToMany
	@JoinColumn(name = "atendimento_analise_juridico_id")
	private AtendimentoAnaliseJuridico analiseJuridico;
	
	@OneToOne
	@JoinColumn(name = "usuario_id")
	private Usuario usuario;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getObservacao() {
		return observacao;
	}

	public void setObservacao(String observacao) {
		this.observacao = observacao;
	}

	public DateTimeFormat getDataRegistro() {
		return dataRegistro;
	}

	public void setDataRegistro(DateTimeFormat dataRegistro) {
		this.dataRegistro = dataRegistro;
	}

	public int getStatus() {
		return status;
	}

	public void setStatus(int status) {
		this.status = status;
	}

	public AtendimentoAnaliseJuridico getAnaliseJuridico() {
		return analiseJuridico;
	}

	public void setAnaliseJuridico(AtendimentoAnaliseJuridico analiseJuridico) {
		this.analiseJuridico = analiseJuridico;
	}

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}
	
	
	
	
	
}
