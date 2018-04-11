package array;

public class ArrayDemo {

	public static void main(String[] args) {
		int[] a=new int[5];
		a[2]=23;
		a[4]=19;
		System.out.println("遍历第一个数组：");
		for(int i=0;i<a.length;i++){   // i充当了下标
			System.out.print(a[i]+"  ");
		}
		System.out.println();
		
		
		int[] b={11,22,33,44,55,66};   // 直接给数组赋值
		System.out.println("遍历第二个数组：");
		for(int i=0;i<b.length;i++){   // i充当了下标
			System.out.print(b[i]+"  ");
		}
		System.out.println();
		System.out.println("使用foreach方式遍历数组：");
		for(int x:b){
			System.out.print(x+"  ");
		}
		System.out.println();
	}

}
