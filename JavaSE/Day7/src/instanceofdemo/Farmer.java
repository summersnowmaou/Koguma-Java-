package instanceofdemo;

public class Farmer extends Person{

	public Farmer() {
	}

	public Farmer(String name, int age) {
		super(name, age);
	}

	
	public void plant() {
		System.out.println("农民种地...");
	}

	
}
