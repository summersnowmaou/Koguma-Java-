package staticdemo;

public class StaticBlock {
	
    static String note;
    static int count;
    
    public StaticBlock(){
    	System.out.println("�޲ι���...");
    }
	
	static{
		System.out.println("���Ǿ�̬������е�����...");
		note="��ע";
		count=2;
		System.out.println("��ʼ�����note��ֵΪ��"+note);
		System.out.println("��ʼ�����count��ֵΪ��"+count);
	}

//	public static void main(String[] args) {
//		System.out.println("����main����");
//
//	}

}
