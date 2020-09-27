package com.simplilearn.accessmodifier;

public class PublicAccessModifier {

	public static void main(String[] args) {
		
		//create object
		Mother mother = new Mother();
		
		System.out.println("The Park Name :"+ mother.park);
		
		System.out.println("Call Show Park Name :"+ mother.showPark());

	}

}


class Mother {
	
	// public variable 
	public String park = "R Khan Park";
	
	// public method
	public String showPark() {
		return park;
	}
	
	//public constructor
	public Mother() {}
}