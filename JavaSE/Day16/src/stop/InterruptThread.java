package stop;

public class InterruptThread extends Thread{
   @Override
   public void run() {
	   System.out.println(Thread.currentThread().getName()+"��ʼִ��...");
	   try {
		   Thread.sleep(5000);
	   } catch (InterruptedException e) {
		   System.out.println("Ϊʲô�����ң�����������");
	   }
	   System.out.println(Thread.currentThread().getName()+"ִ�����");
   }
}
