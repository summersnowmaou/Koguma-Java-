package day6;

public class ExtendsDemo {
	
	public void show() {
		System.out.println("这是父类...");
	}
}
 
class Demo1 extends ExtendsDemo{
	
	
	public Demo1() {
		super();
	}

	public void show() {
		System.out.println("这是子类...");
	}
}
