package com.solid.common;

public class ValidationException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private String message = null;

	public ValidationException() {
		super();
	}

	public ValidationException(String message) {
		super(message);
		this.message = message;
	}

	public ValidationException(Throwable cause) {
		super(cause);
	}

	@Override
	public String toString() {
		return message;
	}

	@Override
	public String getMessage() {
		return message;
	}

}
