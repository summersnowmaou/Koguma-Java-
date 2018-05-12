package thread;

public class ThreadDemo {

	public static void main(String[] args)throws Exception {
		MyThread t1=new MyThread("A线程");   // 实例化线程对象
		t1.start();
		MyThread t2=new MyThread("B线程");   
		t2.start();
		try {
			Thread.sleep(5000);   // 当前线程休眠1秒
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("***************"+Thread.currentThread().getName()+"正在运行...*****************");

	}

}
