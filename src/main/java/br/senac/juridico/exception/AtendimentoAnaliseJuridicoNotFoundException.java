package br.senac.juridico.exception;

public class AtendimentoAnaliseJuridicoNotFoundException extends RuntimeException{
	
	private static final long serialVersionUID = 1L;

	public AtendimentoAnaliseJuridicoNotFoundException(String mensagem) {
		super(mensagem);
	}
}