package exception;

public class Finally {

	public static void main(String[] args) {
		int result=method();
		System.out.println("结果是："+result);
	}
	
	
	public static int method(){
		try{
			int a=100;
			int b=1;
			int c=a/b;
			return c;
		}catch(Exception e){
			System.out.println("发生异常啦...");
		}finally{
			return 999;
		}
	}

}
