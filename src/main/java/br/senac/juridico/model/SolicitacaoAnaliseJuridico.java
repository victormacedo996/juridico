package br.senac.juridico.model;

import java.io.Serializable;
<<<<<<< HEAD
import java.util.Date;

import jakarta.persistence.*;

@Entity
public class SolicitacaoAnaliseJuridico implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "solicitacao_analise_id", nullable = false)
	private int id;
	
	@Column(name = "solicitacao_analise_numero", nullable = false)
	private int numero;
	
	@Column(name = "solicitacao_analise_dataRegistro", nullable = false)
	private Date dataRegistro;
	
	@Column(name = "solicitacao_analise_titulo", nullable = false)
	private String titulo;
	
	@Column(name = "solicitacao_analise_observacao", nullable = true)
	private String observacao;	
	
	@Column(name = "solicitacao_analise_status", nullable = false)
	private int status;

	public int getId() {
		return id;
	}

	public void setId(int id) {
=======
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
@Table(name="solicitacao_analise_juridico")
public class SolicitacaoAnaliseJuridico implements Serializable{

	private static final long serialVersionUID = -8597563105451013420L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="solicitacao_analise_id", nullable = false)
	private Integer id;

	@Column(name = "solicitacao_analise_numero", nullable = false)
	private int numero;

	@DateTimeFormat(iso = ISO.DATE_TIME)
	@Column(name = "solicitacao_analise_data_registro", nullable = false)
	private LocalDateTime dataRegistro;

	@Column(name = "solicitacao_analise_titulo", nullable = false)
	private String titulo;

	@Column(name = "solicitacao_analise_observacao", nullable = false)
	private String observacao;

	@Column(name = "solicitacao_analise_status", nullable  = false)
	private int status;

	@ManyToOne
	@JoinColumn(name = "solicitacao_tipo_id")
	private SolicitacaoTipo solicitacaoTipo;

	@ManyToOne
	@JoinColumn(name = "usuario_id")
	private Usuario usuario;

	@ManyToOne
	@JoinColumn(name = "solicitacao_prioridade_id")
	private SolicitacaoPrioridade prioridade;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
>>>>>>> master
		this.id = id;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

<<<<<<< HEAD
	public Date getDataRegistro() {
		return dataRegistro;
	}

	public void setDataRegistro(Date dataRegistro) {
=======
	public LocalDateTime getDataRegistro() {
		return dataRegistro;
	}

	public void setDataRegistro(LocalDateTime dataRegistro) {
>>>>>>> master
		this.dataRegistro = dataRegistro;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getObservacao() {
		return observacao;
	}

	public void setObservacao(String observacao) {
		this.observacao = observacao;
	}

	public int getStatus() {
		return status;
	}

	public void setStatus(int status) {
		this.status = status;
	}
<<<<<<< HEAD
	
}
=======

	public SolicitacaoTipo getSolicitacaoTipo() {
		return solicitacaoTipo;
	}

	public void setSolicitacaoTipo(SolicitacaoTipo solicitacaoTipo) {
		this.solicitacaoTipo = solicitacaoTipo;
	}

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

	public SolicitacaoPrioridade getPrioridade() {
		return prioridade;
	}

	public void setPrioridade(SolicitacaoPrioridade prioridade) {
		this.prioridade = prioridade;
	}

}
>>>>>>> master
