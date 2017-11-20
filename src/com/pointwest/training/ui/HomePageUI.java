package com.pointwest.training.ui;

import java.util.List;
import java.util.Scanner;

import com.pointwest.training.bean.AnimalBean;

public class HomePageUI {
	// Variable Declaration
	Scanner vserInput = new Scanner(System.in);
	
	public void displayMainMenu(boolean isEmpty, boolean isFull) {
		System.out.println("Welcome to the Animal Shelter");
		if (isEmpty==true) {
			System.out.println("The Shelter is currently empty.");
		}
		if (isFull==true) {
			System.out.println("The Shelter is currently full.");
		}
		System.out.println("Please select an option:");
		if (isFull != true) {
		System.out.println("[1] Add an Animal");
		}
		if (isEmpty!=true) {
		System.out.println("[2] Remove an Animal");
		System.out.println("[3] View all Animals");
		}
		
	}

	public int menuChoice() {
		int menuSelection;
		menuSelection = vserInput.nextInt();
		return menuSelection;
	}
	
	public void displayAddAnimalSpeciesSelectMenu() {
		// Species Selection
		System.out.println("Add Animal Form");
		System.out.println("Please Select Species");
		System.out.println("[1] Cat");
		System.out.println("[2] Dog");
		System.out.println("[3] Parrot");
	}
	// Collect Animal Attributes:
	public String collectAddAnimalNameUI(String newAnimal) {
		String animalName;
		System.out.println("Enter the "+newAnimal+"'s name.");
		animalName = vserInput.next();
		return animalName;
		}
	
	public int collectAddAnimalAgeUI(String newAnimal) {
		int animalAge;
		System.out.println("Enter the "+newAnimal+"'s age.");
		animalAge = vserInput.nextInt();
		return animalAge;
		}
	
	public String collectAddAnimalGenderUI(String newAnimal) {
		String animalGender;
		System.out.println("Enter the  "+newAnimal+"'s gender (M/F).");
		animalGender = vserInput.next();
		return animalGender;
		}
	
	public int removeAnimalUI() {
		int uniqueID;
		System.out.println("Remove Animal from House");
		System.out.println("Please enter Animal's Unique ID");
		uniqueID = vserInput.nextInt();
		return uniqueID;
	}
	
	public void viewAnimalUI(List<AnimalBean> animalList) {
		System.out.println("Meet our lovely animal friends!");
		//Loop for animalList Array
		for (AnimalBean displayAnimal: animalList) {
			String animalWords;
			animalWords = animalSelfIntroduction(displayAnimal);
			System.out.println(animalWords);
			}
		
		}
	
	public String animalSelfIntroduction(AnimalBean speakingAnimal) {
		String animalWords;
		
		animalWords = ((Integer)speakingAnimal.getUniqueID()).toString()+" "+speakingAnimal.signatureSound()+" Hi I'm "+speakingAnimal.getAnimalName()+" the "+speakingAnimal.getSpeciesName()+" "+((Integer)speakingAnimal.getAnimalAge()).toString()+" years old";
		return animalWords;
			
	}
	public void thereWasAProblem() {
		System.out.println("There was a problem adding the animal. Please try again.");
	}
		
	public void animalAddedAdvisory () {
		System.out.println("Animal is now added");
	}
	
	public void animalRemovedAdvisory (boolean animalRemoved) {
		if (animalRemoved==true) {
			System.out.println("Animal removed successfully");
		} else
			System.out.println("There was a problem removing the animal. Please try again.");
	}
	public boolean shelterIsFull () {
		boolean willContinue=true;
		System.out.println("The Animal Shelter is currently full and unable to accept new animals. Do you want to continue?(Y/N)");
	
			String userContinue = vserInput.next();
			if (userContinue.equalsIgnoreCase("y")) {
				willContinue = true;
				return willContinue;
			} else if (userContinue.equalsIgnoreCase("n")) {
				System.out.println("Thanks for using The Animal Shelter! Goodbye!");
				willContinue = false;
				return willContinue;
			} 
			return willContinue;
	}
}

