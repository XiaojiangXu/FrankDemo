package com.frank.base;

public class Human {
	public Human(int h) {
		height = h;
		System.out.println("I'm born");
		Human.population = Human.population +1;
	}

	public Human(int h, String s) {
		height = h;
		System.out.println("Ne Zha:I'm born, " + s);
	}

	protected void breath() {
		System.out.println("hu...hu...");
	}

	public void breath(int rep) {
		int i;
		for (i = 0; i < rep; i++) {
			System.out.println("lu...lu...");
		}
	}

	public void repeatBreath(int rep) {
		int i;
		for (i = 0; i < rep; i++) {
			breath();
		}
	}

	public void growHeight(int h) {
		height = height + h;
	}

	int getHeight() {
		return height;
	}

	private int height = 175;
	
	public static int getPopulation(){
		return Human.population;
	}
	
	private static int population;
	private static boolean is_mammal = true;


}
