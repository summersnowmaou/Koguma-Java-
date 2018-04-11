package inner.member;

public class Outer {
   private String name="中国人";
   
   // 成员内部类
   class MemberInner{
	   public void method(){
		   System.out.println("内部类可以访问外部类的私有属性："+name);
	   }
   }
   
   public MemberInner getMemberInstance(){
	   return new MemberInner();
   }
}
