package br.senac.juridico.model;

import java.io.Serializable;
import java.util.List;

import org.springframework.format.annotation.DateTimeFormat;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "atendimento_analise_juridico")
public class AtendimentoAnaliseJuridico implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -2372052507147264884L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "atendimento_analise_juridico_id", nullable = false)
	private Integer id;
	
	@Column(name = "atendimento_analise_juridico_data_inicio", nullable = false)
	private DateTimeFormat dataInicio;
	
	@Column(name = "atendimento_analise_juridico_prazo_estimado", nullable = false)
	private int prazoEstimado;
	
	@Column(name = "atendimento_analise_juridico_data_encerramento", nullable = false)
	private DateTimeFormat dataEncerramento;
	
	@Column(name = "atendimento_analise_juridico_status", nullable = false)
	private int status;
	
	@OneToMany
	@JoinColumn(name = "solicitacao_analise_id")
	private SolicitacaoAnaliseJuridico solicitacaoId;
	
	//nome do atributo de join está respondavel_usuario_id
	//no diagrama de relacionamento está OneToOne
	@ManyToMany
	@JoinTable(name = "responsavel",
		joinColumns = { @JoinColumn(name = "usuario_id")
	},
		inverseJoinColumns = {@JoinColumn(name = "atendimento_analise_juridico_id")
		}
			)
	private List<Usuario> usuarios;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public DateTimeFormat getDataInicio() {
		return dataInicio;
	}

	public void setDataInicio(DateTimeFormat dataInicio) {
		this.dataInicio = dataInicio;
	}

	public int getPrazoEstimado() {
		return prazoEstimado;
	}

	public void setPrazoEstimado(int prazoEstimado) {
		this.prazoEstimado = prazoEstimado;
	}

	public DateTimeFormat getDataEncerramento() {
		return dataEncerramento;
	}

	public void setDataEncerramento(DateTimeFormat dataEncerramento) {
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

	public List<Usuario> getUsuarios() {
		return usuarios;
	}

	public void setUsuarios(List<Usuario> usuarios) {
		this.usuarios = usuarios;
	}
	
	
	
	

}
