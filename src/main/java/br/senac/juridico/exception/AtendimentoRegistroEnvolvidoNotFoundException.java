package br.senac.juridico.exception;


public class AtendimentoRegistroEnvolvidoNotFoundException extends RuntimeException{

	private static final long serialVersionUID = 1L;

	public AtendimentoRegistroEnvolvidoNotFoundException(String mensagem) {
		super(mensagem);
	}
}
