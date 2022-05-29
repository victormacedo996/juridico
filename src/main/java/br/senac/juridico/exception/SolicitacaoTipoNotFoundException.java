package br.senac.juridico.exception;

public class SolicitacaoTipoNotFoundException extends RuntimeException{

	private static final long serialVersionUID = 1L;

	public SolicitacaoTipoNotFoundException(String mensagem) {
		super(mensagem);
	}
}