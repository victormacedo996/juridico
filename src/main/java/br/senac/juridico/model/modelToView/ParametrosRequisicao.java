package br.senac.juridico.model.modelToView;
import java.util.List;
import br.senac.juridico.model.TipoSolicitacao;

public class ParametrosRequisicao {
	private List<TipoSolicitacao> tipoSolicitacao;

	public List<TipoSolicitacao> getTipoSolicitacao() {
		return tipoSolicitacao;
	}

	public void setTipoSolicitacao(List<TipoSolicitacao> tipoSolicitacao) {
		this.tipoSolicitacao = tipoSolicitacao;
	}	
}
