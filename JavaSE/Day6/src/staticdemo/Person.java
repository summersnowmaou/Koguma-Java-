package staticdemo;

public class Person{
   String name;
   int age;
   static int count;  // ��̬��Ա����������ģ��������и���Ķ����ǹ��õ�
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
	   System.out.println("�ҽ�"+this.name+"������"+this.age+"����");
   }
}
