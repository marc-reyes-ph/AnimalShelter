package com.pointwest.training.bean;

public class CatBean extends AnimalBean {
	// Override Species Name
	protected String speciesName="Cat";
    // Override Signature Sound
	public String signatureSound() {
		return "Meow, Ming, Mew";
	}
	public String getSpeciesName() {
		return speciesName;
	}
	public void setSpeciesName(String speciesName) {
		this.speciesName = speciesName;
	}
	
}
