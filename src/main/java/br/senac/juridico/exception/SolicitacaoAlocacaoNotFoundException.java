package br.senac.juridico.exception;

public class SolicitacaoAlocacaoNotFoundException extends RuntimeException{

	private static final long serialVersionUID = 3671517324586984123L;

	public SolicitacaoAlocacaoNotFoundException(String mensagem) {
		super(mensagem);
	}
}
