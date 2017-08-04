package com.frank.base;
public class Test3 {
	public static void main(String[] args) {
		MusicCup musiccup = new MusicCup();
		musiccup.addWater(5);
		System.out.println(musiccup.waterContent());
		musiccup.drinkWater(3);
		System.out.println(musiccup.waterContent());
		musiccup.play();
	}

}

class MusicCup implements Cup, MusicPlayer {

	public void addWater(int w) {
		this.water = this.water + w;

	}

	public void drinkWater(int w) {
		this.water = this.water - w;

	}

	public void play() {
		System.out.println("la...la...la");
	}

	public int waterContent() {
		return this.water;
	}

	private int water = 0;

}