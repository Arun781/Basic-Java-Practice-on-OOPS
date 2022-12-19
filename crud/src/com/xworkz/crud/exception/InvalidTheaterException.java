package com.xworkz.crud.exception;

public class InvalidTheaterException extends Exception{
	public InvalidTheaterException() {
		super();
			}

	public InvalidTheaterException(String message, Throwable cause, boolean enableSuppression,
			boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
		// TODO Auto-generated constructor stub
	}

	public InvalidTheaterException(String message, Throwable cause) {
		super(message, cause);
		// TODO Auto-generated constructor stub
	}

	public InvalidTheaterException(String message) {
		super(message);
		// TODO Auto-generated constructor stub
	}

	public InvalidTheaterException(Throwable cause) {
		super(cause);
		// TODO Auto-generated constructor stub
	}
}
