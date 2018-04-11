package single;
/*
 * ������ʽ������ģʽ:������ص�JVMʱ������ֱ�Ӵ������������û�����������ʱ(�û���Ҫʹ��ʱ)����ʵ�����õ�������
 * */
public class LazySingleInstance {
   
	// �ڸ����ڲ�ʵ��������
	private static LazySingleInstance single;
	
	// ˽�л����췽������ֹ�ⲿʵ��������Ķ���
	private LazySingleInstance(){
		
	}

	// ��̬��������ȡ��������
	public static synchronized LazySingleInstance getSingleInstance() {
		if(single==null){
			System.out.println("��һ�η��ʵ���������......");
			single=new LazySingleInstance();
		}
		return single;
	}
	
}
