package com.simplilearn.accessmodifier;

public class KidHero extends Hero{
	
	public static void main(String[] args) {
		
		KidHero kh = new KidHero();
		
		System.out.println("Kid power :"+kh.power);
		
		kh.showPower();
	}

}
