package thread;

public class YieldMethod {

	public static void main(String[] args) {
       MyThread mt=new MyThread();
       mt.start();
       for(int i=0;i<=100;i++){
		    System.out.println(Thread.currentThread().getName()+"执行,i="+i);
		    Thread.yield();   // 给调度程序的一个提示，当前线程愿意放弃它当前的处理器的使用。调度程序可以自由地忽略这个提示。
	   }
	}

}
