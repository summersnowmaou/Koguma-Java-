package exception;

public class RuntimeExceptionDemo {

	public static void main(String[] args) {
		int a=100;
		int b=0;
		String str=null;
		int[] array=new int[5];
		try{
			array[5]=100;
			str.equals("abc");
			int c=a/b;
		}catch(NullPointerException e){
			System.out.println("空指针异常~~~");
		}catch(ArithmeticException e){
			System.out.println("算数异常~~~");
		}catch(Exception e){
			System.out.println("以上catch都没有捕获到异常，由最大父类Exception处理异常");
		}finally{
			System.out.println("无论异常是否发生，都会执行");
		}
		
		System.out.println("main()方法执行完毕！");

	}

}
