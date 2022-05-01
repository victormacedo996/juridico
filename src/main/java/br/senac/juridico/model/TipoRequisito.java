package br.senac.juridico.model;

public class TipoRequisito {
	private int Id;
	private String Descricao;
	private int Status;
	private int TipoCampo;
	//private solicitacao tipoId
	
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
	public int getTipoCampo() {
		return TipoCampo;
	}
	public void setTipoCampo(int tipoCampo) {
		TipoCampo = tipoCampo;
	}
	
}
