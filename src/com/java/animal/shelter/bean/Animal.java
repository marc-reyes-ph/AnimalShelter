package com.java.animal.shelter.bean;

public abstract class Animal {
	
	public static int staticId = 1000;
	private int referenceId;
	private String name;
	private String age;
	private String gender;
	private String breed;
	private int numOfFeet;
	
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
	public void setName(String name) {
		this.name = name;
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

	public String getBreed() {
		return breed;
	}

	public void setBreed(String breed) {
		this.breed = breed;
	}
	
	public int getNumOfFeet(){
		return numOfFeet;
	}
	
	public void setNumOfFeet(int numOfFeet) {
		this.numOfFeet = numOfFeet;
	}

}
