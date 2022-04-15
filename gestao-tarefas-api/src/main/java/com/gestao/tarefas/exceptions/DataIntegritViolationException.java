package com.gestao.tarefas.exceptions;

public class DataIntegritViolationException extends RuntimeException {

	private static final long serialVersionUID = 1L;

	public DataIntegritViolationException(String message, Throwable cause) {
		super(message, cause);
	}

	public DataIntegritViolationException(String message) {
		super(message);
	}

}
