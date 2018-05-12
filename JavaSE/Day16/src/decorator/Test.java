package decorator;
import java.io.*;
public class Test {

	public static void main(String[] args) {
		Love love=new Student();
		ConcreteDecorator dec=new ConcreteDecorator(love);
		dec.beautifulLove();
		
	}

}
