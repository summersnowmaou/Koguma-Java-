package staticdemo;

public class Person{
   String name;
   int age;
   static int count;  // 静态成员变量属于类的，对于所有该类的对象是公用的
   public Person(){
	   count++;
   }
   public Person(String name,int age){
	   count++;
	   this.name=name;
	   this.age=age;
   }
   
   public static int getStaticCount(){
	   return count;
   }
   
   public void say(){
	   System.out.println("我叫"+this.name+"；今年"+this.age+"岁了");
   }
}
