package thread;

public class JoinMethod {

	public static void main(String[] args) {
		MyThread mt=new MyThread("我的线程");
		mt.start();   // 启动线程
		for(int i=0;i<=100;i++){
			if(i==30){
				try {
					mt.join();   // 当前线程必须等待，直到调用join()方法的线程对象所对应的线程运行完毕，当前线程才恢复执行
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
			System.out.println(Thread.currentThread().getName()+"执行,i="+i);
		}

	}

}
