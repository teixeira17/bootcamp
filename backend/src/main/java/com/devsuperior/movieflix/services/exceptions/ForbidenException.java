package com.devsuperior.movieflix.services.exceptions;

public class ForbidenException extends RuntimeException{
	private static final long serialVersionUID = 1L;
	
	public ForbidenException(String msg) {
		super(msg);
	}
}
