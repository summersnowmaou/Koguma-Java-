package common;

import java.util.Random;

public class RandomDemo {

	public static void main(String[] args) {
		Random ran=new Random();
		int result=ran.nextInt(16)+3;
		System.out.println("�������3��18�����֣�"+result);
		System.out.println("�������booleanֵ��"+ran.nextBoolean());

	}

}
