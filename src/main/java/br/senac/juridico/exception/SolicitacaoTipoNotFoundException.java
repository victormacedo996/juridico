package br.senac.juridico.exception;

public class SolicitacaoTipoNotFoundException extends RuntimeException{

	/**
	 * 
	 */
	private static final long serialVersionUID = 4042452029038357503L;
	
	public SolicitacaoTipoNotFoundException(String mensagem) {
		super(mensagem);
	}

}
