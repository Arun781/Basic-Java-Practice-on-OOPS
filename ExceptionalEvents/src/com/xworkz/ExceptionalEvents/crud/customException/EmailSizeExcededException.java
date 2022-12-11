package com.xworkz.ExceptionalEvents.crud.customException;

@SuppressWarnings("serial")
public class EmailSizeExcededException extends RuntimeException {
	
	public EmailSizeExcededException() {
		System.out.println("EmailSizeExcededException is created.....................");
	}
}
