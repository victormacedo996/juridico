package br.senac.juridico.model;

import java.io.Serializable;
<<<<<<< HEAD

import org.springframework.format.annotation.DateTimeFormat;
=======
import java.time.LocalDateTime;

import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.format.annotation.DateTimeFormat.ISO;
>>>>>>> temp

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
<<<<<<< HEAD
import jakarta.persistence.OneToMany;
=======
import jakarta.persistence.ManyToOne;
>>>>>>> temp
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "atendimento_registro")
public class AtendimentoRegistro implements Serializable{

<<<<<<< HEAD
	
	/**
	 * 
	 */
=======
>>>>>>> temp
	private static final long serialVersionUID = 6856322142045337276L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "atendimento_registro_id", nullable = false)
	private Integer id;
<<<<<<< HEAD
	
	@Column(name = "atendimento_registro_observacao", nullable = false)
	private String observacao;
	
	@Column(name = "atendimento_registro_data", nullable = false)
	private DateTimeFormat dataRegistro;
	
	@Column(name = "atendimento_registro_status", nullable = false)
	private int status;
	
	@OneToMany
	@JoinColumn(name = "atendimento_analise_juridico_id")
	private AtendimentoAnaliseJuridico analiseJuridico;
	
=======

	@Column(columnDefinition = "TEXT", name = "atendimento_registro_observacao", nullable = false)
	private String observacao;

	@DateTimeFormat(iso = ISO.DATE_TIME)
	@Column(name = "atendimento_registro_data", nullable = false)
	private LocalDateTime dataRegistro;

	@Column(name = "atendimento_registro_status", nullable = false)
	private int status;

	@ManyToOne
	@JoinColumn(name = "atendimento_analise_juridico_id")
	private AtendimentoAnaliseJuridico atendimentoAnaliseJuridico;

>>>>>>> temp
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

<<<<<<< HEAD
	public DateTimeFormat getDataRegistro() {
		return dataRegistro;
	}

	public void setDataRegistro(DateTimeFormat dataRegistro) {
=======
	public LocalDateTime getDataRegistro() {
		return dataRegistro;
	}

	public void setDataRegistro(LocalDateTime dataRegistro) {
>>>>>>> temp
		this.dataRegistro = dataRegistro;
	}

	public int getStatus() {
		return status;
	}

	public void setStatus(int status) {
		this.status = status;
	}

<<<<<<< HEAD
	public AtendimentoAnaliseJuridico getAnaliseJuridico() {
		return analiseJuridico;
	}

	public void setAnaliseJuridico(AtendimentoAnaliseJuridico analiseJuridico) {
		this.analiseJuridico = analiseJuridico;
=======
	public AtendimentoAnaliseJuridico getAtendimentoAnaliseJuridico() {
		return atendimentoAnaliseJuridico;
	}

	public void setAtendimentoAnaliseJuridico(AtendimentoAnaliseJuridico atendimentoAnaliseJuridico) {
		this.atendimentoAnaliseJuridico = atendimentoAnaliseJuridico;
>>>>>>> temp
	}

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}
<<<<<<< HEAD
	
	
	
	
	
}
=======

}
>>>>>>> temp
