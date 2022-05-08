package br.senac.juridico.exception;

public class SolicitacaoAlocacaoNotFoundException extends RuntimeException {

	private static final long serialVersionUID = 1L;

	public SolicitacaoAlocacaoNotFoundException(String mensagem) {
		super(mensagem);
	}
}