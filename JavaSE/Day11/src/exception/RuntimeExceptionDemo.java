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
			System.out.println("��ָ���쳣~~~");
		}catch(ArithmeticException e){
			System.out.println("�����쳣~~~");
		}catch(Exception e){
			System.out.println("����catch��û�в����쳣���������Exception�����쳣");
		}finally{
			System.out.println("�����쳣�Ƿ���������ִ��");
		}
		
		System.out.println("main()����ִ����ϣ�");

	}

}
