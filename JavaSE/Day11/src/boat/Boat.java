package boat;

public class Boat {
   private static final int MAX_STORE=1000;   // �������������
   
   private int currentStore;    // ��ǰ�ػ���
   
   // ��ӻ���ķ���
   public void load(int num)throws LoadException{
	   System.out.println("�ػ�֮ǰ�ĵ�ǰ�ػ�����"+currentStore);
	   this.currentStore+=num;  // ģ��װ�ػ���
	   System.out.println("�ػ�֮��ĵ�ǰ�ػ�����"+currentStore);
	   if(this.currentStore>MAX_STORE){
		   throw new LoadException("�����Ѿ��������������������ѹ���ˣ�");
	   }
   }
   
}
