package com.xworkz.crud.exception;

public class InvalidBuildingException extends Exception{
	public InvalidBuildingException() {
		super();
	}
	public InvalidBuildingException(String message, Throwable cause, boolean enableSuppression,
			boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
		
	}

	public InvalidBuildingException(String message, Throwable cause) {
		super(message, cause);
		
	}

	public InvalidBuildingException(String message) {
		super(message);
		
	}

	public InvalidBuildingException(Throwable cause) {
		super(cause);
		
	}

}
