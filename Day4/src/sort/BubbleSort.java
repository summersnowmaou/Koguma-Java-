package sort;

public class BubbleSort {

	public static void main(String[] args) {
		int[] a={22,55,11,66,88,77,44,99,33};
        bubbleSort(a);
	}
	
	public static void bubbleSort(int[] a){
		for (int i = 1; i <=a.length-1; i++) {   // 外层循环控制比较的“趟数”
		//	System.out.println("开始第"+i+"趟排序");
			boolean flag=true;
			
			for(int j=0;j<a.length-i;j++){   // j变量是数组的索引(下标)，j也控制着当前趟的“两两比较”的次数
				if(a[j]>a[j+1]){
					int temp=a[j];
					a[j]=a[j+1];
					a[j+1]=temp;
					flag=false;
				}
			}
		//	System.out.println("第"+i+"趟结束");
			if(flag){   // 如果当前“趟”已经排号序，则不必进行下一趟的排序，直接跳出外层循环
				break;
			}
		/**	
			System.out.println("第"+i+"趟排序结果：");
			for(int x:a){
				System.out.print(x+"  ");
			}
			
			System.out.println();
			**/
		}
	}

}
