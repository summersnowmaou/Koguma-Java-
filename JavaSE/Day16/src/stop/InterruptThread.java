package stop;

public class InterruptThread extends Thread{
   @Override
   public void run() {
	   System.out.println(Thread.currentThread().getName()+"开始执行...");
	   try {
		   Thread.sleep(5000);
	   } catch (InterruptedException e) {
		   System.out.println("为什么叫醒我？？？！！！");
	   }
	   System.out.println(Thread.currentThread().getName()+"执行完毕");
   }
}
