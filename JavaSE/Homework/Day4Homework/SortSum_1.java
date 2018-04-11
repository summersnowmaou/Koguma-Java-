package day2homework;
import java.util.*; 
public class SortSum_1 {

	public static void main(String[] args) {
		System.out.println("请输入数组长度和数组的值的上限和下限:");
		Scanner scan = new Scanner(System.in);
		int n=scan.nextInt();
		int redius = scan.nextInt();
		int x = scan.nextInt();
		int[] arrary= CrArray(n,redius,x);
		System.out.println("创建的数组为：");
		for(int i=0;i<arrary.length;i++) {
			System.out.print(arrary[i]+"  ");
		}
		System.out.println();
		int[] array2 = sortSum(arrary);
		int average = array2[0]/arrary.length;
		System.out.print("该数组的和为："+array2[0]+"\n该数组元素的平均值:"+average+"\n"
				+ "数组最大值为："+array2[2]+"  数组最小值为："+array2[1]);
		scan.close();
	}
	//构建数组
	public static int[] CrArray(int n,int redius,int x) {
		int[] array = new int[n];
		for(int i=0;i<array.length;i++) {
			array[i] =x+ (int)(Math.random()*(redius+1-x));
		}
		return array;
	}
	
	public static int[] sortSum(int[] a) {
		int[] array = new int[3];
		int sum = a[0];
		int max = a[0];
		int min = a[0];
		for(int i=1;i<a.length;i++) {
			sum+=a[i];
			if(a[i]<min)min=a[i];
			if(a[i]>max)max=a[i];
		}
		array[0] = sum;
		array[1] = min;
		array[2] = max;
	
		return array;
	}
}
