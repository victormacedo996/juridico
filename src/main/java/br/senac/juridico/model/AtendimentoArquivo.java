package br.senac.juridico.model;

import java.io.Serializable;

import jakarta.persistence.*;

@Entity
@Table(name = "atendimento_arquivo")
public class AtendimentoArquivo implements Serializable{
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
	@JoinColumn(name = "atendimento_registro_id")
	private AtendimentoRegistro atendimentoRegistro;

	@ManyToOne
	@JoinColumn(name = "arquivo_id")
	private Arquivo arquivo_id;
}
