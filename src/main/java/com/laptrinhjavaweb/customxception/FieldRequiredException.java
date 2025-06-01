package com.laptrinhjavaweb.customxception;

public class FieldRequiredException extends RuntimeException{
	public FieldRequiredException(String err) {
		super(err);
	}
}
