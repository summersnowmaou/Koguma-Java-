package interfacedemo;

public class Bird implements Fly,Walk{

	@Override
	public void fly() {
		System.out.println("Ğ¡Äñ·ÉÏè...");
	}

	@Override
	public void walk() {
		System.out.println("Ğ¡ÄñÉ¢²½...");
		
	}

}
