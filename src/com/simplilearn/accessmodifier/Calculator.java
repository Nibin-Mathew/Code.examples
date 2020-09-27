package com.simplilearn.accessmodifier;

public class Calculator {

	public static void main(String[] args) {
		
		Add a1 = new Add();
		System.out.println("After Addition Value : "+a1.add());
		
		Sub s1 = new Sub();
		System.out.println("After Substraction Value : "+s1.sub());
	}

}

class Add{
	
	private int number1= 200;
	private int number2= 100;
	
	public int add() {
		return number1+number2;
	}
	
	public Add() {}
}

class Sub {
	
	private int number1= 200;
	private int number2= 100;
	
	public int sub() {
		return number1-number2;
	}
}

class Div{
	
}

class Mul {
	
}