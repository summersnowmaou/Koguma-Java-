package stop;

public class StopLoop {

	public static void main(String[] args) {
		LoopThread lt=new LoopThread();
		lt.start();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		lt.setFlag(false);
		System.out.println("end..........");

	}

}
