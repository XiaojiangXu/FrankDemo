package com.frank.base;
public class Test1 {
	public static void main(String[] args) {
		Human aPerson = new Human(160);
		aPerson.breath(10);
		System.out.println(aPerson.getHeight());
		aPerson.growHeight(10);
		System.out.println(aPerson.getHeight());
		aPerson.repeatBreath(10);
		Human neZha = new Human(150, "shit");
		System.out.println(neZha.getHeight());
		
		Women aWomen = new Women(180);
		aWomen.growHeight(120);
		System.out.println(aWomen.getHeight());
		
		System.out.println(Human.getPopulation());
		Human bPerson = new Human(169);
		System.out.println(bPerson.getPopulation());
	}

}