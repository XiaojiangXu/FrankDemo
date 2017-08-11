package com.frank.advance;

public class Test6 {

	public static void main(String[] args) {
		Thread thread1 = new Thread(new NewThread1(),"first");
		Thread thread2 = new Thread(new NewThread1(),"second");
		thread1.start();
		thread2.start();
	}
}

class NewThread2 implements  Runnable{
	
	public String toString(){
		return Thread.currentThread().getName();
	}
	public void run() {
		System.out.println(this);
	}
}
