package homework;

public class Base {

	public static void main(String[] args) {
		int number=0;   // 存储每一项的数据
		int sum=0;
		for (int i = 0; i < 5; i++) {
			number=number*10+2;   // 计算当前项的数据
			sum+=number;  // 相当于 sum=sum+number
		}
		System.out.println("结果是："+sum);
	}

}
