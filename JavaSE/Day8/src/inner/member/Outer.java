package inner.member;

public class Outer {
   private String name="�й���";
   
   // ��Ա�ڲ���
   class MemberInner{
	   public void method(){
		   System.out.println("�ڲ�����Է����ⲿ���˽�����ԣ�"+name);
	   }
   }
   
   public MemberInner getMemberInstance(){
	   return new MemberInner();
   }
}
