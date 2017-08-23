package com.expertzlab.spring.dependency.example2;

public class GreetGoodEveningImpl implements Greeting{

	String message;
	String name;
	
	public GreetGoodEveningImpl(String message, String name) {
		super();
		this.message = message;
		this.name=name;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public void greet() {
		System.out.println(message);
	}

}
