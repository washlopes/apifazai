package br.com.bb.dicre.gesem.apifazai.exceptions;

public class NotFoundException extends RuntimeException {

	/**
	 * 
	 */
	private static final long serialVersionUID = 6709294987478644998L;
	
	public NotFoundException(String mensagem) {
		super(mensagem);
	}

}
