package br.senac.juridico.exception;

public class RegistroMudancaStatusNotFoundException extends RuntimeException {

	private static final long serialVersionUID = -3814782388029190733L;

	public RegistroMudancaStatusNotFoundException(String mensagem) {
		super(mensagem);
	}
}
