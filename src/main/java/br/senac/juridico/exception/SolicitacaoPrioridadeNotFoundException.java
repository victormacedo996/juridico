package br.senac.juridico.exception;

public class SolicitacaoPrioridadeNotFoundException extends RuntimeException{

	private static final long serialVersionUID = 1L;

	public SolicitacaoPrioridadeNotFoundException(String mensagem) {
		super(mensagem);
	}
}
