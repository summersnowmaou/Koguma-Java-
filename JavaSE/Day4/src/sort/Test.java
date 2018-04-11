package sort;

import java.util.Random;

public class Test {

	public static void main(String[] args) {
        Random ran=new Random();
        int[] a=new int[50000];
        for (int i = 0; i < a.length; i++) {
			int temp=ran.nextInt(100000);
			a[i]=temp;
		}
        long start=System.currentTimeMillis();
        QuickSort.quickSort(a, 0, a.length-1);
      //  BubbleSort.bubbleSort(a);
      //  InsertSort.insertSort(a);
        long end=System.currentTimeMillis();
        System.out.println("ºÄÊ±"+(end-start)+"ºÁÃë");
	}

}
