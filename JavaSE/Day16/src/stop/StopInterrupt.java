package stop;

public class StopInterrupt {

	public static void main(String[] args) {
		InterruptThread it=new InterruptThread();
		it.start();
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		it.interrupt();   // �������̣߳�ʹ֮�׳�InterruptedException�쳣

	}

}
