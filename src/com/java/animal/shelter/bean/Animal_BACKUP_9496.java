package com.java.animal.shelter.bean;

public abstract class Animal {
	
	public static int staticId = 1000;
	private int referenceId;
	private String name;
	private String age;
	private String gender;
<<<<<<< HEAD
	private int numOfFeet;
	private void makeSound();
=======
>>>>>>> 701b6837257f7fbab344105cdff80507bbcbf015
	
	public abstract String sound();
	 
	public int getReferenceId() {
		return referenceId;
	}
	public void setReferenceId(int referenceId) {
		this.referenceId = referenceId;
	}
	public String getName() {
		return name;
	}
	public void setName(String petName) {
		name = petName;
	}
	public String getAge() {
		return age;
	}
	public void setAge(String age) {
		this.age = age;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
<<<<<<< HEAD
	
	public int getNumOfFeet(){
		return numOfFeet;
	}
	
	public void setNumOfFeet(int numOfFeet) {
		this.numOfFeet = numOfFeet;
	}
=======

>>>>>>> 701b6837257f7fbab344105cdff80507bbcbf015
}
