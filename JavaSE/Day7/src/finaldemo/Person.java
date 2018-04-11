package finaldemo;

public class Person{
   private final  String NAME="张三";
   
   public void testFinal(){
	   final int a;
	   a=5;
	   System.out.println(a);
   }
   
   public final void walk(){
	   System.out.println("人用两条腿走路~~~");
   }
}
