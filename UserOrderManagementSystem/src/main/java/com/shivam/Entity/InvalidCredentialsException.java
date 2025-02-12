package com.shivam.Entity;

import java.lang.classfile.Superclass;

import org.apache.logging.log4j.message.Message;

public class InvalidCredentialsException extends RuntimeException {
	public InvalidCredentialsException (String message){
		super(message);
	}
}
