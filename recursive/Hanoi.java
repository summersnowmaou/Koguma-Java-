package recursive;

import java.util.Scanner;

public class Hanoi {

	public static int count=0;  // 记录移动次数
	
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.print("请输入圆盘个数：");
		int num=scan.nextInt();
		hanoi(num,'A','B','C');
		scan.close();
	}
	
	/**
	 * 
	 * @param num :圆盘个数
	 * @param start  : 起始棒
	 * @param help : 辅助棒
	 * @param dest : 目标棒
	 */
	public static void hanoi(int num,char start,char help,char dest){
		if(num==1){
			count++;
			System.out.println("第"+count+"次移动,从"+start+"棒移动到"+dest+"棒");
		}else{
			hanoi(num-1,start,dest,help);
			count++;
			System.out.println("第"+count+"次移动,从"+start+"棒移动到"+dest+"棒");
			hanoi(num-1,help,start,dest);
		}
	}

}
