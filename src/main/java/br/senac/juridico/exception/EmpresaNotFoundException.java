package br.senac.juridico.exception;

public class EmpresaNotFoundException extends RuntimeException {

	private static final long serialVersionUID = 1L;

	public EmpresaNotFoundException(String mensagem) {
		super(mensagem);
	}
}
