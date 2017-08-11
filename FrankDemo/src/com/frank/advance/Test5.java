package com.frank.advance;

public class Test5 {

	public static void main(String[] args) {
		NewThread1 thread1 = new NewThread1();
	    NewThread1 thread2 = new NewThread1();
	    thread1.start();
	    thread2.start();
	}

}

class NewThread1 extends Thread{
	private static int threadID = 0;
	
	public NewThread1(){
		super("ID:"+(++threadID));
	}
	
	public String toString(){
		return super.getName();
	}
	
	public void run(){
		System.out.println(this);
	}
}