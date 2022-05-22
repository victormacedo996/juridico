package br.senac.juridico.exception;


public class SolicitacaoAnaliseJuridicoNotFoundException extends RuntimeException{

	private static final long serialVersionUID = 1L;

	public SolicitacaoAnaliseJuridicoNotFoundException(String mensagem) {
		super(mensagem);
	}
}
