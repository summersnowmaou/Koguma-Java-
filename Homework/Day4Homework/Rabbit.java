package day2homework;

public class Rabbit {

	public static void main(String[] args) {	
		int n = 12;
		int[] array = rabbit(n);
		for(int i=1;i<=array.length;i++) {
			System.out.println("第"+i+"个月："+array[i-1]+"对");
		}
	}
	/* 方法一：
	 	public static void main(String[] args) {
		int f = 1;
		int g = 0;
		for(int i = 1;i<=12;i++){
			System.out.println("第"+i+"个月："+f+"对");
			f = f+g;
			g = f-g;
		}
	}
	*/
	//方法二：
	public static int[] rabbit(int n) {
		int[] a=new int[n];
		if(n==1) {
			a[0]=1;
			return a;
		}else {
			a[0]=a[1]=1;
			if(n==2) {
				return a;
			}else {
				int x=2;
				while(x<n) {
					a[x]=a[x-1]+a[x-2];
					x++;
				}
				return a;
			}
		}
	}

}
