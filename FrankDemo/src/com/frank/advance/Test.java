package com.frank.advance;

public class Test {
	public static void main(String[] args) {
		Battery aBattery = new Battery();
		aBattery.chargeBattery(0.5);
		aBattery.userBattery(-0.5);
		
	}

}

class Battery{

	public void chargeBattery(double p) {
		if(this.power + p <1.0){
			this.power = this.power + p;
		}
		else {
			this.power = 1.0;
		}
	}

	public boolean userBattery(double p) {
		try{
			test(p);
		}
		catch(Exception e){
			System.out.println("catch Exception");
			System.out.println(e.getMessage());
			p = 0.0;
		}
		if(this.power >= p){
			this.power = this.power - p;
			return true;
		}
		else {
			this.power = 1.0;
			return false;
		}
	}
	
	private void test(double p) throws Exception{
		if(p<0){
			Exception e = new Exception("p must be positive");
			throw e;
		}
	}
	
	private double power = 0.0;
}