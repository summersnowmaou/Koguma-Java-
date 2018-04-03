package method;

import java.util.Scanner;

public class BaseMethod {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.print("请输入基数：");
		int base=scan.nextInt();    // 等待键盘输入
		System.out.print("请输入次数：");
		int count=scan.nextInt();
		int sum=baseSum(base,count);
		System.out.println("计算结果："+sum);
		scan.close();
	}
	
	/** 这个方法用来根据基数和次数计算和
	 * @param base 接收传递来的基数
	 * @param count  接收传递来的次数
	 * @return 返回计算结果
	 */
	public static int baseSum(int base,int count){
		int number=0;
		int sum=0;
		for (int i = 0; i <count; i++) {
			number=number*10+base;   // 计算当前项的数据
			sum+=number;
		}
		return sum;
	}

}
