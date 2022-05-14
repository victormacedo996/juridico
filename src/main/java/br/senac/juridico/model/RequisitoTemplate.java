package br.senac.juridico.model;

import java.io.Serializable;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "requisito_template")
public class RequisitoTemplate implements Serializable{

	private static final long serialVersionUID = -2372052507147264884L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "requisito_template_id", nullable = false)
	private int Id;
	@Column(name = "requisito_template_descricao", nullable = false)
	private String Descricao;
	@Column(name = "requisito_template_status", nullable = false)
	private int Status;
	@Column(name = "arquivo_id", nullable = false)
	private int arquivoId;
	
	public int getId() {
		return Id;
	}
	public void setId(int id) {
		Id = id;
	}
	public String getDescricao() {
		return Descricao;
	}
	public void setDescricao(String descricao) {
		Descricao = descricao;
	}
	public int getStatus() {
		return Status;
	}
	public void setStatus(int status) {
		Status = status;
	}
	public int getArquivoId() {
		return arquivoId;
	}
	public void setArquivoId(int arquivoId) {
		this.arquivoId = arquivoId;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	
}
