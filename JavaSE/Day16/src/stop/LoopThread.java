package stop;

public class LoopThread extends Thread{
	private boolean flag=true;
	public void setFlag(boolean flag) {
		this.flag = flag;
	}
    @Override
	public void run() {
		while(flag){
			System.out.println(Thread.currentThread().getName()+"正在运行...");
		}
	}
}
