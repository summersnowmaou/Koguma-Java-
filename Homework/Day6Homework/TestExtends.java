package day6;

public class TestExtends {

	public static void main(String[] args) {
		Demo1 a = new Demo1();
		a.show();
		ExtendsDemo b = new ExtendsDemo();
		b.show();
		b=a;
		b.show();

	}
 
}
