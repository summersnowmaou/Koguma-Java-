package throwdemo;

import java.io.IOException;

public class ThrowDemo {

	public static void main(String[] args) {
		try{
			throw new ArithmeticException();
		}catch(Exception e){
			System.out.println("���������쳣��...");
		}
		int a=100;
		System.out.println("end....");

	}

}
