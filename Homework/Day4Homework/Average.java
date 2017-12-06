package day2homework;

public class Average {

	public static void main(String[] args) {
		int[] a = {78,60,85,96,77,66,60,82,88,85};
		int sum = 0;
		sort(a,0,a.length-1);
		for(int i=1;i<a.length-1;i++) {
			sum+=a[i];
		}
		System.out.print("该选手的最后得分为："+sum/(a.length-2));
	}
	
	public static void sort(int[] a,int lo,int hi) {
		if(lo>=hi) {
			return;
		}
		int data = a[lo];
		int i = lo+1;
		int j = hi;
		while(true) {
			while(i<=hi && a[i]<data) {
				i++;
			}
			while(j>lo+1 && a[j]>data) {
				j--;
			}
			if(j>i) {
				int temp = a[i];
				a[i] = a[j];
				a[j] = temp;
			}else {
				break;
			}
		}
		a[lo] = a[j];
		a[j] = data;
		sort(a,lo,j-1);
		sort(a,j+1,hi);
	}
}
