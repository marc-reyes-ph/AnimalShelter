package com.pointwest.training.manager;

import java.util.ArrayList;
import java.util.List;

import com.pointwest.training.bean.AnimalBean;
import com.pointwest.training.bean.CatBean;
import com.pointwest.training.bean.DogBean;
import com.pointwest.training.bean.ParrotBean;

public class AnimalShelterMgr {
	List<AnimalBean> animalList = new ArrayList<AnimalBean>();
	int uniqueID=100;
	boolean isFull=false;
	boolean isEmpty=true;
	
	public boolean validateShelterCapacity() {
		
		if (animalList.size() > 9) {
			isFull=true;
		}
				
		return isFull;
	}
	
	public boolean checkifEmpty () {
		if (animalList.size() > 0) {
			isEmpty=false;
		} else isEmpty=true;
	   return isEmpty;		
	}
	
	
	public boolean addAnimalManager(String animalSpecies, String animalName, int animalAge, String animalGender) {
		boolean animalAdded=false;
		if (animalSpecies == "Cat"){
			// instantiate and set identifiers
				AnimalBean newCat = new CatBean();
				uniqueID++;
				newCat.setUniqueID(uniqueID);
				newCat.setAnimalName(animalName);
				newCat.setAnimalAge(animalAge);
				newCat.setAnimalGender(animalGender);
				// write to animal List array
				animalList.add(newCat);
				animalAdded = true;
				
		} else if (animalSpecies == "Dog") {
			// instantiate and set identifiers
			AnimalBean newDog = new DogBean();
			uniqueID++;
			newDog.setUniqueID(uniqueID);
			newDog.setAnimalName(animalName);
			newDog.setAnimalAge(animalAge);
			newDog.setAnimalGender(animalGender);
			// write to animal List array
			animalList.add(newDog);
			animalAdded = true;
			
		
		} else if (animalSpecies == "Parrot") {
			// instantiate and set identifiers
			AnimalBean newParrot = new ParrotBean();
			uniqueID++;
			newParrot.setUniqueID(uniqueID);
			newParrot.setAnimalName(animalName);
			newParrot.setAnimalAge(animalAge);
			newParrot.setAnimalGender(animalGender);
			// write to animal List array
			animalList.add(newParrot);
			animalAdded = true;
			
		}
		
		return animalAdded;
	}

	public boolean removeAnimalMgr(int uniqueID) {
		boolean animalRemoved = false;
		AnimalBean removeThis = null; 
		
		for (AnimalBean compareID: animalList) {
			if (compareID.getUniqueID()==uniqueID) {
				removeThis = compareID;
			}
		}
		animalList.remove(removeThis);
		animalRemoved=true;
		return animalRemoved;
	}


	public List<AnimalBean> getAnimalList() {
		return animalList;
	}
	
}
