package com.frank.base;

class Women extends Human{
	public Women(int h)
    {
        super(h); // base class constructor
        System.out.println("Hello, Pandora!");
    }
	public Human giveBirth(){
		System.out.println("Give birth");
		return (new Human(20));
	}
	public void breath()
    {
        super.breath();
        System.out.println("su...");
    }

}
