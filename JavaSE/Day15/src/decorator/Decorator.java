package decorator;

public class Decorator {
   private Student stu;
   public Decorator(){
	   
   }
   public Decorator(Student stu){
	   this.stu=stu;
   }
   
   public void love(){
	   System.out.println("ËÍ»¨....");
	   stu.love();
	   System.out.println("Ô¼»á...");
   }
}
