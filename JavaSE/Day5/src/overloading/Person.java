package overloading;

public class Person {
   String name;
   int age;
   String sex;
   public Person(){
	   
   }
   
   public Person(String n,int a){
	   name=n;
	   age=a;
   }
   
   public Person(String n,int a,String s){
	   name=n;
	   age=a;
	   sex=s;
   }
   
   public void say(){
	   System.out.println("�ҽ�"+name+"������"+age+"����;�Ա�"+sex);
   }
   
}
