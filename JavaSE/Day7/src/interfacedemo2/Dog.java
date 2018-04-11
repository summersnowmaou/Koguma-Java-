package interfacedemo2;

import interfacedemo.*;

public class Dog extends Animal implements Walk{

	@Override
	public void walk() {
		System.out.println("Ð¡¹·É¢²½...");
	}

}
