package decorator;

public class Decorator {
   private Student stu;
   public Decorator(){
	   
   }
   public Decorator(Student stu){
	   this.stu=stu;
   }
   
   public void love(){
	   System.out.println("�ͻ�....");
	   stu.love();
	   System.out.println("Լ��...");
   }
}
