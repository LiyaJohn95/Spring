package com.expertzlab.collection.example;

public class Person {
 String name;
 Address address;
 String age;
 
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
public String getAge() {
	return age;
}
public void setAge(String age) {
	this.age = age;
}
@Override
public String toString() {
	return "Person [name=" + name + ", address=" + address + ", age=" + age + "]";
}


 
 
}
