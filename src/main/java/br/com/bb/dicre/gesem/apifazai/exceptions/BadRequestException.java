package br.com.bb.dicre.gesem.apifazai.exceptions;

public class BadRequestException extends RuntimeException {

	/**
	 * 
	 */
	private static final long serialVersionUID = 8178703845219843629L;
	
	public BadRequestException(String mensagem) {
		super(mensagem);
	}

}
