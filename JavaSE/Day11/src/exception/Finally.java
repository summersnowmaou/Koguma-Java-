package exception;

public class Finally {

	public static void main(String[] args) {
		int result=method();
		System.out.println("����ǣ�"+result);
	}
	
	
	public static int method(){
		try{
			int a=100;
			int b=1;
			int c=a/b;
			return c;
		}catch(Exception e){
			System.out.println("�����쳣��...");
		}finally{
			return 999;
		}
	}

}
