package sort;

public class InsertSort {

	public static void main(String[] args) {
		int[] a={22,55,11,66,88,77,44,99,33};
        insertSort(a);
        System.out.println("插入排序的结果：");
        for (int i = 0; i < a.length; i++) {
			System.out.print(a[i]+"  ");
		}
	}
	
	
	public static void insertSort(int[] a){
		for (int i = 1; i <=a.length-1; i++) {
			int data=a[i];  // 当前“指示灯数据”
			int j=i-1;   // 使用j变量记录“指示灯数据”的前一个数据的索引
			while(j>=0 && data<a[j]){
				a[j+1]=a[j];   // 后移“指示灯”数据前面的数据
				j--;
			}
			a[j+1]=data;
		}
	}

}
