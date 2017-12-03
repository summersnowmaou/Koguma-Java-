package recursive;

public class Test {

	public static void main(String[] args) {
		test1();
		System.out.println("结束主方法...");

	}
	
	
	public static void test1(){
		System.out.println("进入test1...");
		test2();
		System.out.println("结束test1...");
	}
	
	public static void test2(){
		System.out.println("hahahahahhhahahah");
	}

}
