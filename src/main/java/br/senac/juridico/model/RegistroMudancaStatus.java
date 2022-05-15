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
@Table(name="registro_mudanca_status")
public class RegistroMudancaStatus implements Serializable{

	private static final long serialVersionUID = 5447778936416717761L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="registro_mudanca_status_id", nullable = false)
	private Integer id;
	
	@DateTimeFormat(iso = ISO.DATE_TIME)
	@Column(name = "registro_mudanca_status_data_mudanca", nullable = false)
	private LocalDateTime data_mudanca;
	
	@OneToOne
	@JoinColumn(name = "atendimento_analise_juridico_id")
	private AtendimentoAnaliseJuridico atendimento_analise_juridico_id;
	
	@OneToOne
	@JoinColumn(name = "status_solicitacao_analise_id_origem", referencedColumnName = "status_solicitacao_analise_id")
	private StatusSolicitacaoAnalise status_solicitacao_analise_id_origem;
	
	@OneToOne
	@JoinColumn(name = "status_solicitacao_analise_id_destino", referencedColumnName = "status_solicitacao_analise_id")
	private StatusSolicitacaoAnalise status_solicitacao_analise_id_destino;
	
	@ManyToOne
	@JoinColumn(name = "solicitacao_analise_id")
	private SolicitacaoAnaliseJuridico solicitacao_analise_id;
	
	@ManyToOne
	@JoinColumn(name = "usuario_id")
	private Usuario usuario_id;

}
