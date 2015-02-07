package br.com.globalcode.util;

public class GlobalcodeException extends Exception{
	public GlobalcodeException(String message) {
		super(message);
	}
	
	public GlobalcodeException(String message, Throwable cause) {
		super(message,cause);
	}
}
