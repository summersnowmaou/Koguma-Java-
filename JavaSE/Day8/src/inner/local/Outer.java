package inner.local;

public class Outer {
   private  String name="�й�";
   public void func(int x){
	    class LocalInner{
		   public void method(){
			   System.out.println("�����ڲ�������ⲿ������ԣ�"+name);
			   System.out.println("�����ڲ�����ʰ����䷽���Ĳ���"+x);
		   }
	   }
	    
	   new LocalInner().method();   // �ھ����ڲ������ڵķ�����ʵ���������ڲ�����󣬲������䷽��
   }
}
