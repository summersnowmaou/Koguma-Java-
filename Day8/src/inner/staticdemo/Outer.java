package inner.staticdemo;

public class Outer {
   private String name="�й�";
   private static int population=14;
   
   static class StaticInner{
	   public void method(){
		   System.out.println("��̬�ڲ���ֱ�ӷ����ⲿ���static���ԣ�"+population);
		   Outer out=new Outer();
		   System.out.println("�ھ�̬�ڲ�����ͨ���ⲿ�������ʷ�static���ԣ�"+out.name);
	   }
   }
   
   public static StaticInner getStaticInner(){
	   return new StaticInner();
   }
}
