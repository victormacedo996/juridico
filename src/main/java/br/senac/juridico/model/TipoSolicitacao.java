package br.senac.juridico.model;

public class TipoSolicitacao {
	private int Id;
	private String Descricao;
	private int TipoPrazo;
	private int TipoStatus;
	
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
	public int getTipoPrazo() {
		return TipoPrazo;
	}
	public void setTipoPrazo(int tipoPrazo) {
		TipoPrazo = tipoPrazo;
	}
	public int getTipoStatus() {
		return TipoStatus;
	}
	public void setTipoStatus(int tipoStatus) {
		TipoStatus = tipoStatus;
	}
}
