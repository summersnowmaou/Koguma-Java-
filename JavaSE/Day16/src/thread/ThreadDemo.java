package thread;

public class ThreadDemo {

	public static void main(String[] args)throws Exception {
		MyThread t1=new MyThread("A�߳�");   // ʵ�����̶߳���
		t1.start();
		MyThread t2=new MyThread("B�߳�");   
		t2.start();
		try {
			Thread.sleep(5000);   // ��ǰ�߳�����1��
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("***************"+Thread.currentThread().getName()+"��������...*****************");

	}

}
