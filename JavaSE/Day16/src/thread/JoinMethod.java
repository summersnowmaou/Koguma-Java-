package thread;

public class JoinMethod {

	public static void main(String[] args) {
		MyThread mt=new MyThread("�ҵ��߳�");
		mt.start();   // �����߳�
		for(int i=0;i<=100;i++){
			if(i==30){
				try {
					mt.join();   // ��ǰ�̱߳���ȴ���ֱ������join()�������̶߳�������Ӧ���߳�������ϣ���ǰ�̲߳Żָ�ִ��
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
			System.out.println(Thread.currentThread().getName()+"ִ��,i="+i);
		}

	}

}
