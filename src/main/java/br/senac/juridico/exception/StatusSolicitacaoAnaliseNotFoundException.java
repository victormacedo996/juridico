package br.senac.juridico.exception;

public class StatusSolicitacaoAnaliseNotFoundException extends RuntimeException {

	private static final long serialVersionUID = 3952207363903914782L;

	public StatusSolicitacaoAnaliseNotFoundException(String mensagem) {
		super(mensagem);
	}
}
