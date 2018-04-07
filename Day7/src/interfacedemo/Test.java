package interfacedemo;

public class Test {

	public static void main(String[] args) {
		Fly f1=new Kite();
		f1.fly();
		Fly f2=new Bird();
		f2.fly();
		Walk w=new Bird();
        w.walk();
	}

}
