package common;

public class SystemDemo {

	public static void main(String[] args) {
		System.out.println("���������Ϣ...");
		System.err.println("�����׼������Ϣ...");
		int[] a = {1,2,3,4};
		int[] b = new int[5];
		System.arraycopy(a,1,b,3,2);   // ���鿽��
		
        for(int x:b){
        	System.out.print(x+"  ");
        }
        System.exit(0);   // �˳�����

	}

}
