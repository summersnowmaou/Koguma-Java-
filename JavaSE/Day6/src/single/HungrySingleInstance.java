package single;
/*
 * ������ʽ������ģʽ:������ص�JVMʱ����������ֱ�Ӵ���
 * */
public class HungrySingleInstance {
   
	// �ڸ����ڲ�ʵ��������
	private static HungrySingleInstance single=new HungrySingleInstance();
	
	// ˽�л����췽������ֹ�ⲿʵ��������Ķ���
	private HungrySingleInstance(){
		
	}

	// ��̬��������ȡ��������
	public static HungrySingleInstance getSingleInstance() {
		return single;
	}
	
	
}
