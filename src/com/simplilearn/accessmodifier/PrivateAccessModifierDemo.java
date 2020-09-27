package com.simplilearn.accessmodifier;

// public class -> accessible anywhere
public class PrivateAccessModifierDemo {

	public static void main(String[] args) {
		// create a object
		
		Father father = new Father();
		
		father.bankMoney;  // Compile time Error.
		
		father.showLetter();  //Compile tie Error.

	}

}


// default class -> accessible within a package
class Father {
	
	// private variable -> accessible only in a class
	private double bankMoney = 2000033;
	
	// private method
	private String showLetters() {
	    return "Private Letters";
	};
	
	// private 
	private double showMoney() {
		return bankMoney;
	}
	// If you make any class constructor private, 
	// you cannot create the instance of that class from outside the class.
	private Father(){};
}
