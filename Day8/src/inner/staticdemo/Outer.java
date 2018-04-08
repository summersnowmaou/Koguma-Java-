package inner.staticdemo;

public class Outer {
   private String name="中国";
   private static int population=14;
   
   static class StaticInner{
	   public void method(){
		   System.out.println("静态内部类直接访问外部类的static属性："+population);
		   Outer out=new Outer();
		   System.out.println("在静态内部类中通过外部类对象访问非static属性："+out.name);
	   }
   }
   
   public static StaticInner getStaticInner(){
	   return new StaticInner();
   }
}
