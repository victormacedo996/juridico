package br.senac.juridico.model;

import java.io.Serializable;
import java.time.LocalDateTime;

import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.format.annotation.DateTimeFormat.ISO;

import jakarta.persistence.*;

@Entity
@Table(name = "atendimento_analise_juridico")
public class AtendimentoAnaliseJuridico implements Serializable{
<<<<<<< HEAD
=======

>>>>>>> 58e93e49a595d6bb26e324707f741cf5041ee629
	private static final long serialVersionUID = -2372052507147264884L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "atendimento_analise_juridico_id", nullable = false)
	private Integer id;
	
	@DateTimeFormat(iso = ISO.DATE_TIME)
	@Column(name = "atendimento_analise_juridico_data_inicio", nullable = false)
	private LocalDateTime dataInicio;

	@Column(name = "atendimento_analise_juridico_prazo_estimado", nullable = false)
	private int prazoEstimado;

	@DateTimeFormat(iso = ISO.DATE_TIME)
	@Column(name = "atendimento_analise_juridico_data_encerramento", nullable = false)
	private LocalDateTime dataEncerramento;

	@Column(name = "atendimento_analise_juridico_status", nullable = false)
	private int status;

	@ManyToOne
	@JoinColumn(name = "solicitacao_analise_id")
	private SolicitacaoAnaliseJuridico solicitacaoId;

<<<<<<< HEAD
=======
	//nome do atributo de join está respondavel_usuario_id
	//no diagrama de relacionamento está OneToOne???
>>>>>>> 58e93e49a595d6bb26e324707f741cf5041ee629
	@OneToOne
	@JoinColumn(name = "responsavel_usuario_id")
	private Usuario usuario;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public LocalDateTime getDataInicio() {
		return dataInicio;
	}

	public void setDataInicio(LocalDateTime dataInicio) {
		this.dataInicio = dataInicio;
	}

	public int getPrazoEstimado() {
		return prazoEstimado;
	}

	public void setPrazoEstimado(int prazoEstimado) {
		this.prazoEstimado = prazoEstimado;
	}

	public LocalDateTime getDataEncerramento() {
		return dataEncerramento;
	}

	public void setDataEncerramento(LocalDateTime dataEncerramento) {
		this.dataEncerramento = dataEncerramento;
	}

	public int getStatus() {
		return status;
	}

	public void setStatus(int status) {
		this.status = status;
	}

	public SolicitacaoAnaliseJuridico getSolicitacaoId() {
		return solicitacaoId;
	}

	public void setSolicitacaoId(SolicitacaoAnaliseJuridico solicitacaoId) {
		this.solicitacaoId = solicitacaoId;
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
