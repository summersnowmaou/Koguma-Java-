package recursive;

public class Test {

	public static void main(String[] args) {
		test1();
		System.out.println("����������...");

	}
	
	
	public static void test1(){
		System.out.println("����test1...");
		test2();
		System.out.println("����test1...");
	}
	
	public static void test2(){
		System.out.println("hahahahahhhahahah");
	}

}
