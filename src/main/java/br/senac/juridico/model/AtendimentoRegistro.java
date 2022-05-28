package br.senac.juridico.model;

import java.io.Serializable;
import java.time.LocalDateTime;

import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.format.annotation.DateTimeFormat.ISO;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "atendimento_registro")
public class AtendimentoRegistro implements Serializable{

	private static final long serialVersionUID = 6856322142045337276L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "atendimento_registro_id", nullable = false)
	private Integer id;

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

	public LocalDateTime getDataRegistro() {
		return dataRegistro;
	}

	public void setDataRegistro(LocalDateTime dataRegistro) {
		this.dataRegistro = dataRegistro;
	}

	public int getStatus() {
		return status;
	}

	public void setStatus(int status) {
		this.status = status;
	}

	public AtendimentoAnaliseJuridico getAtendimentoAnaliseJuridico() {
		return atendimentoAnaliseJuridico;
	}

	public void setAtendimentoAnaliseJuridico(AtendimentoAnaliseJuridico atendimentoAnaliseJuridico) {
		this.atendimentoAnaliseJuridico = atendimentoAnaliseJuridico;
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
>>>>>>> 58e93e49a595d6bb26e324707f741cf5041ee629
