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
	}

}

class Human {
	public Human(int h) {
		height = h;
		System.out.println("I'm born");
	}

	public Human(int h, String s) {
		height = h;
		System.out.println("Ne Zha:I'm born, " + s);
	}

	private void breath() {
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
}