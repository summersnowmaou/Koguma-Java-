package day2homework;

public class FindNum {

	public static void main(String[] args) {
		int[] a = {23,12,45,11};
		int[] b = {99,33,12,45,67,11};
		String str=findNum1(a,b);
		if(str==" ") {
			System.out.println("两个数组没有共同元素！");
		}else {
			System.out.print("两个数组的共同元素为："+str);
		}
		
		
	}
	/**  方法一：
	public static void findNum(int[] a,int[] b) {
		
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<b.length;j++) {
				if(a[i]==b[j]) {
					System.out.print(a[i]);
				}
					
			}
		}
	}
	*/
	//方法二：
	public static String findNum1(int[] a,int[] b) {
	
		String str=" ";
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<b.length;j++) {
				if(a[i]==b[j]) {
					str+=a[i]+" ";
				}
			}
		}
	return str;
	}
}