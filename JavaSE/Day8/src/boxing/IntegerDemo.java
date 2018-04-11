package boxing;

public class IntegerDemo {

	public static void main(String[] args) {
		System.out.println("int的最大值："+Integer.MAX_VALUE);
		System.out.println("int的最小值："+Integer.MIN_VALUE);
		Integer a=100;   // 自动装箱
		int b=a;   // 自动拆箱
		String str="123";
		int temp=Integer.parseInt(str);   // 将字符串转换为int
		System.out.println(temp+5);

	}

}
