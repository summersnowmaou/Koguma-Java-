package common;

public class FinalizeDemo {

	public static void main(String[] args) {
		Person per=new Person();
		per=null;   // ��per������Ϊnull,ʹ���ڴ��е�Person�����Ϊ��������
        System.gc();  // ��ʽ����JVM������������gc
	}

}
