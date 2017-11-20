package com.pointwest.training.bean;

public class ParrotBean extends AnimalBean {
		// Override Species Name
		protected String speciesName="Parrot";
	    // Override Signature Sound
		public String signatureSound() {
			return "Pangit, Taho, Bote ";
		}
		public String getSpeciesName() {
			return speciesName;
		}
		public void setSpeciesName(String speciesName) {
			this.speciesName = speciesName;
		}
}
