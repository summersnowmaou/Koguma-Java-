package throwdemo;

import java.io.IOException;

public class ThrowDemo {

	public static void main(String[] args) {
		try{
			throw new ArithmeticException();
		}catch(Exception e){
			System.out.println("发生算数异常了...");
		}
		int a=100;
		System.out.println("end....");

	}

}
