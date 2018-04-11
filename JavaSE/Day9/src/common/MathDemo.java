package common;

public class MathDemo {

	public static void main(String[] args) {
		double powResult=Math.pow(2,3);
		System.out.println("2的3次方为："+powResult);
		System.out.println("8的平方根："+Math.sqrt(8));
		System.out.println("-7.35的绝对值是："+Math.abs(-7.35));
		System.out.println("8.1向上取整："+Math.ceil(8.1));
		System.out.println("9.9向下取整："+Math.floor(9.9));
		System.out.println("8.499四舍五入的结果："+Math.round(8.499));
		System.out.println("8.5四舍五入的结果："+Math.round(8.5));
		System.out.println("随机返回一个从0.0(包括)到1.0(不包括)值："+Math.random());
		int ran=(int)(Math.random()*16)+3;
		System.out.println("随机返回3到18的数字："+ran);
		System.out.println("圆周率是："+Math.PI);

	}

}
