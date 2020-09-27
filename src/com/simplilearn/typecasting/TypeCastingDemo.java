package com.simplilearn.typecasting;

public class TypeCastingDemo {
	
	public static void main(String[] args) {
		
		// 1. Widening , Implicit TypeCasting
		int luckyNumber = 7;
		
		double price = 149.33;  // double is last value in auto type conversion
		
		byte age = 10;
		
		System.out.println("Value of Lucky Number " + luckyNumber);
		
		// Widening
		float floatNumber = luckyNumber;
		
		System.out.println("Value of Float Lucky Number " + floatNumber);
		
		// Widening 
		double doubleNumber = floatNumber;
		System.out.println("Value of Double Lucky Number " + doubleNumber);
		
		System.out.println("The Price Value " + price);
		
		short shortAge = age;  // byte -> short
		
		int intergerAge = shortAge;  // short -> int
		
		
		long longAge = intergerAge;  // int -> long
		
		float floatAge = age;  // byte -> float 
		
		
		double doubleAge = floatAge;  // float -> double
		
		
		
		
		
		
		
		
		
	}

}
