package regex;

import java.util.Scanner;

public class PhoneNumber {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.print("�������ֻ����룺");
		String phone=scan.next();
		if(phone.matches("1\\d{10}")){
			System.out.println("��ϲ���ֻ��������Ҫ��");
		}else{
			System.out.println("������Ҫ��");
		}
		

	}

}
