package homework;

import java.util.Scanner;

public class Rabbit {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.print("请输入月数：");
		int month=scan.nextInt();
		/**
        for (int i = 1; i <=month; i++) {
			System.out.println("第"+i+"个月的兔子对数："+feiBo(i));
		}**/
		for (int i = 1; i <=month; i++) {
			System.out.println("第"+i+"个月的兔子对数："+anotherMethod(i));
		}
		scan.close();
        
        
	}
	
	public static int feiBo(int month){
		if(month==1 || month==2){
			return 1;
		}
		return feiBo(month-1)+feiBo(month-2);
	}
	
	public static int anotherMethod(int month){
		if(month==1 || month==2){
			return 1;
		}
		int result=0;
		int first=1;
		int second=1;
		for(int i=3;i<=month;i++){
			result=first+second;
			first=second;
		    second=result;
		}
		return result;
	}

}
