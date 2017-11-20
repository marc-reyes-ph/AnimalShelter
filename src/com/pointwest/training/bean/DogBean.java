package com.pointwest.training.bean;

public class DogBean extends AnimalBean {
	// Override Species Name
	protected String speciesName="Dog";
    // Override Signature Sound
	public String signatureSound() {
		return "Woof, Arf, Yip ";
	}
	public String getSpeciesName() {
		return speciesName;
	}
	public void setSpeciesName(String speciesName) {
		this.speciesName = speciesName;
	}
	
}
