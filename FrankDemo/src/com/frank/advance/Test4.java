package com.frank.advance;

public class Test4 {

	public static void main(String[] args) throws ClassNotFoundException {
		Human aPerson = new Human();
		Class c1 = aPerson.getClass();
		System.out.println(c1.getName());
		
		Human anotherPerson = new Human();
		Class c2 = anotherPerson.getClass();
		System.out.println(c2.getName());
		
		Class c3 = Class.forName("Human");
		System.out.println(c1.getName());
		
		Class c4 = Women.class;
		System.out.println(c2.getName());
	}
}

class Human{
	public int getHeight(){
		return this.height;
	}
	
	public void growHeight(int h){
		this.height = this.height + h;
	}
	
	private int height;
}

class Women extends Human{
	public Human giveBirth(){
		System.out.println("Give birth");
		return (new Human());
	}
}