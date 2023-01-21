package com.educandoweb.course.services.exceptions;

public class DatabaseException extends RuntimeException {
	
	private static final long serialVersionUID = 1L;
	
	public DatabaseException(String msg) {
		super("Unable to delete this user. There is one or more orders related to this user.");
	}

}
