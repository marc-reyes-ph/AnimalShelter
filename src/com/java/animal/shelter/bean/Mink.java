package com.java.animal.shelter.bean;

public class Mink extends Animal{
	
	private String type = "Mink";
	private String sound = "whir whir";

	@Override
	public String sound() {
		return sound;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}
	
}
