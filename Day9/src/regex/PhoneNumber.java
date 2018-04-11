package regex;

import java.util.Scanner;

public class PhoneNumber {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.print("请输入手机号码：");
		String phone=scan.next();
		if(phone.matches("1\\d{10}")){
			System.out.println("恭喜，手机号码符合要求");
		}else{
			System.out.println("不符合要求！");
		}
		

	}

}
