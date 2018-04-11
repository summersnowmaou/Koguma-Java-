package common;

import java.util.Random;

public class RandomDemo {

	public static void main(String[] args) {
		Random ran=new Random();
		int result=ran.nextInt(16)+3;
		System.out.println("随机返回3到18的数字："+result);
		System.out.println("随机返回boolean值："+ran.nextBoolean());

	}

}
