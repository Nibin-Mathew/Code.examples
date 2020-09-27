package com.simplilearn.typecasting;

public class NarrowingTypeCast {
	
	public static void main(String[] args) {
		// Narrowing 
		
		double price = 149.34;
		
		System.out.println("Price Value "+price);
		
		int intPrice = (int) price;  // Explicit type Conversion
		
		System.out.println("Int Price Value "+intPrice);
		
		float floatPrice = (float) price; // Explicit type conversion
		
		System.out.println("Float Price Value "+floatPrice);
		
	}

}
