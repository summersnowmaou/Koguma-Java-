package homework;

import java.util.Scanner;

public class LeapHomework {

	public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.print("�������ж���ݣ�");
        int year=scan.nextInt();
        if((year%4==0 && year%100!=0) || (year%400==0)){
        	System.out.println(year+"������");
        }else{
        	System.out.println("��������");
        }
	}

}
