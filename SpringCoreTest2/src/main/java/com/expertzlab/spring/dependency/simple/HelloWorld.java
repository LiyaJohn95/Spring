package com.expertzlab.spring.dependency.simple;

/**
 * Spring bean
 *
 */
public class HelloWorld {
	private String user;

	String message;
	
	
	
	
	
	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public String getUser() {
		return user;
	}

	public void setUser(String user) {
		this.user = user;
	}

	public void sayHello() {  
		System.out.println(message + "-"+ user);
	}
	
	public void init(){
	      System.out.println("initializing bean.");
	}
	
	public void destroy() {
	      System.out.println("Bean about to destroy now.");
	}
}