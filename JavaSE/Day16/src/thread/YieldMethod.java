package thread;

public class YieldMethod {

	public static void main(String[] args) {
       MyThread mt=new MyThread();
       mt.start();
       for(int i=0;i<=100;i++){
		    System.out.println(Thread.currentThread().getName()+"ִ��,i="+i);
		    Thread.yield();   // �����ȳ����һ����ʾ����ǰ�߳�Ը���������ǰ�Ĵ�������ʹ�á����ȳ���������ɵغ��������ʾ��
	   }
	}

}
