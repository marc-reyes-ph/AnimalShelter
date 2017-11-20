package com.pointwest.training.main;

import java.util.List;

import com.pointwest.training.bean.AnimalBean;
import com.pointwest.training.manager.AnimalShelterMgr;
import com.pointwest.training.ui.HomePageUI;

public class AnimalShelterMain {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HomePageUI homePage = new HomePageUI();
		AnimalShelterMgr aniManager = new AnimalShelterMgr();
		boolean isExiting = false;
		int chooseSpecies = 0;
		String speciesName = "Animal";
		String animalName;
		String animalGender; 
		int animalAge;
		boolean isEmpty=true;
		boolean isFull=false;
		
		//main program loop
do {
	isEmpty = aniManager.checkifEmpty();
	homePage.displayMainMenu(isEmpty, isFull);
	int mainSelect =homePage.menuChoice();
	switch (mainSelect) {
	case 1: homePage.displayAddAnimalSpeciesSelectMenu();
			chooseSpecies = homePage.menuChoice();
			switch (chooseSpecies) {
			case 1: speciesName = "Cat";
				animalName = homePage.collectAddAnimalNameUI(speciesName);
				animalAge = homePage.collectAddAnimalAgeUI(speciesName);
				animalGender = homePage.collectAddAnimalGenderUI(speciesName);
				if (aniManager.addAnimalManager(speciesName, animalName, animalAge, animalGender)==false) {
					homePage.thereWasAProblem();
					break;
				}
				homePage.animalAddedAdvisory();
				break;
			case 2: speciesName = "Dog";
				animalName = homePage.collectAddAnimalNameUI(speciesName);
				animalAge = homePage.collectAddAnimalAgeUI(speciesName);
				animalGender = homePage.collectAddAnimalGenderUI(speciesName);
				if (aniManager.addAnimalManager(speciesName, animalName, animalAge, animalGender)==false) {
					homePage.thereWasAProblem();
					break;
				}
				homePage.animalAddedAdvisory();
				break;
			case 3: speciesName = "Parrot";
				animalName = homePage.collectAddAnimalNameUI(speciesName);
				animalAge = homePage.collectAddAnimalAgeUI(speciesName);
				animalGender = homePage.collectAddAnimalGenderUI(speciesName);
				if (aniManager.addAnimalManager(speciesName, animalName, animalAge, animalGender)==false) {
					homePage.thereWasAProblem();
					break;
				}
					break;
			}
			if (aniManager.validateShelterCapacity()==true) {
				if (homePage.shelterIsFull()==false){
				isExiting = true;
				break;
			} else isFull = true;
			}
			
			break;
	case 2: int uuID = homePage.removeAnimalUI();
			boolean animalRemoved = aniManager.removeAnimalMgr(uuID);
			homePage.animalRemovedAdvisory(animalRemoved);
			if (animalRemoved==true) {
				isFull=false;
			}
			break;
	case 3: List<AnimalBean> aniList = aniManager.getAnimalList();
			homePage.viewAnimalUI(aniList);
			break;
	}
	
	
} while (isExiting == false);

		
		
	}

}
