package br.senac.juridico.exception;

public class UsuarioNotFoundException extends RuntimeException{

	private static final long serialVersionUID = 2066706112841651196L;

	public UsuarioNotFoundException(String mensagem) {
		super(mensagem);
	}
}
