package inner.local;

public class Outer {
   private  String name="中国";
   public void func(int x){
	    class LocalInner{
		   public void method(){
			   System.out.println("局域内部类访问外部类的属性："+name);
			   System.out.println("局域内部类访问包含其方法的参数"+x);
		   }
	   }
	    
	   new LocalInner().method();   // 在局域内部类所在的方法中实例化局域内部类对象，并调用其方法
   }
}
