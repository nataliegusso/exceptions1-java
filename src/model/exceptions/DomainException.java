package model.exceptions;

public class DomainException extends RuntimeException {
	private static final long serialVersionUID = 1L;  //Exception precisa ter uma vers�o (por ser serail

	public DomainException(String msg) {
		super(msg);
	}
}
