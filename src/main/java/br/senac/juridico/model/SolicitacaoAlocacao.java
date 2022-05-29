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
import jakarta.persistence.Table;

@Entity
@Table(name="solicitacao_alocacao")
public class SolicitacaoAlocacao  implements Serializable{
	private static final long serialVersionUID = -3907831914262113489L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="solicitacao_alocacao_id", nullable = false)
	private Integer id;
	
	@DateTimeFormat(iso = ISO.DATE_TIME)
	@Column(name = "solicitacao_alocacao_data", nullable = false)
	private LocalDateTime data;
	
	@Column(name = "solicitacao_alocacao_status", nullable  = false)
	private int status;
	
	@ManyToOne
	@JoinColumn(name = "solicitacao_analise_id")
	private SolicitacaoAnaliseJuridico solicitacao_analise_id;
	
	@ManyToOne
	@JoinColumn(name = "usuario_id")
	private Usuario usuario_id;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public LocalDateTime getData() {
		return data;
	}

	public void setData(LocalDateTime data) {
		this.data = data;
	}

	public int getStatus() {
		return status;
	}

	public void setStatus(int status) {
		this.status = status;
	}

	public SolicitacaoAnaliseJuridico getSolicitacao_analise_id() {
		return solicitacao_analise_id;
	}

	public void setSolicitacao_analise_id(SolicitacaoAnaliseJuridico solicitacao_analise_id) {
		this.solicitacao_analise_id = solicitacao_analise_id;
	}

	public Usuario getUsuario_id() {
		return usuario_id;
	}

	public void setUsuario_id(Usuario usuario_id) {
		this.usuario_id = usuario_id;
	}


	
}
