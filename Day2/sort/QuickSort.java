package sort;

public class QuickSort {

	public static void main(String[] args) {
		int[] a={22,55,11,66,88,77,44,99,33};
		quickSort(a,0,a.length-1);
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i]+"  ");
		}
	}
	
	
	public static void quickSort(int[] array,int start,int end){
		if(start>=end){
			return;   // 结束方法
		}
		int data=array[start];   // 将起始索引执行的值作为“分界值”
		int i=start+1;  // 记录向右移动的位置（“红军”）
		int j=end;   // 记录向左移动的位置("蓝军")
		while(true){
			while(i<=end && array[i]<data){
				i++;   // 索引右移
			}
			while(j>=start+1 && array[j]>data){
				j--;   // 索引左移
			}
			if(j>i){
				int temp=array[i];
				array[i]=array[j];
				array[j]=temp;
			}else{
				break;
			}
		}
		// “蓝军”与“分界值”交换位置
		array[start]=array[j];
		array[j]=data;   
		quickSort(array,start,j-1);   // 递归调用完成“分界值”左边的排序
		quickSort(array,j+1,end);   // 递归调用完成“分界值”右边的排序
	}

}
