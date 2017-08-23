package com.expertzlab.spring.constructor.injection.example;

public class Student {  
	
private int rollNo;  
private String name;  
private Address address;
  
public Student() {}  
  
public Student(int id, String name, Address address) {  
    super();  
    this.rollNo = id;  
    this.name = name;  
    this.address = address;  
}  
  




public int getRollNo() {
	return rollNo;
}

public void setRollNo(int rollNo) {
	this.rollNo = rollNo;
}

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

public Address getAddress() {
	return address;
}

public void setAddress(Address address) {
	this.address = address;
}

void show(){  
    System.out.println(rollNo+" "+name);  
    System.out.println(address.toString());  
}  
  
}  