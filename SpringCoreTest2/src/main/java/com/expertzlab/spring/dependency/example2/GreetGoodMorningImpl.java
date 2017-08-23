package com.expertzlab.spring.dependency.example2;

public class GreetGoodMorningImpl implements Greeting{

	String message;
	String name;
	
	
	public GreetGoodMorningImpl(String message, String name) {
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
		System.out.println(message +"-"+ name);
	}

}
