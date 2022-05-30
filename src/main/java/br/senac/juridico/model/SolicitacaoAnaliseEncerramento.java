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
@Table(name = "solicitacao_analise_encerramento")
public class SolicitacaoAnaliseEncerramento implements Serializable{

	private static final long serialVersionUID = -426292880572391170L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "solicitacao_analise_encerramento_id", nullable = false)
	private Integer analise_encerramento_id;	

	@DateTimeFormat(iso = ISO.DATE_TIME)
	@Column(name = "solicitacao_analise_encerramento_data", nullable = false)
	private LocalDateTime analise_encerramento_data;	

	@Column(name = "solicitacao_analise_encerramento_observacao", nullable = false)
	private String analise_encerramento_observacao;

	@ManyToOne
	@JoinColumn(name = "arquivo_id")
	private Arquivo arquivo_id;

	@Column(name = "solicitacao_analise_encerramento_status", nullable = false)
	private Integer analise_encerramento_status;

	public Integer getAnalise_encerramento_id() {
		return analise_encerramento_id;
	}

	public void setAnalise_encerramento_id(Integer analise_encerramento_id) {
		this.analise_encerramento_id = analise_encerramento_id;
	}

	public LocalDateTime getAnalise_encerramento_data() {
		return analise_encerramento_data;
	}

	public void setAnalise_encerramento_data(LocalDateTime analise_encerramento_data) {
		this.analise_encerramento_data = analise_encerramento_data;
	}

	public String getAnalise_encerramento_observacao() {
		return analise_encerramento_observacao;
	}

	public void setAnalise_encerramento_observacao(String analise_encerramento_observacao) {
		this.analise_encerramento_observacao = analise_encerramento_observacao;
	}

	public Arquivo getArquivo_id() {
		return arquivo_id;
	}

	public void setArquivo_id(Arquivo arquivo_id) {
		this.arquivo_id = arquivo_id;
	}

	public Integer getAnalise_encerramento_status() {
		return analise_encerramento_status;
	}

	public void setAnalise_encerramento_status(Integer analise_encerramento_status) {
		this.analise_encerramento_status = analise_encerramento_status;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}	


}