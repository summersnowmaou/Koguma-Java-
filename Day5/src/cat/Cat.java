package cat;

public class Cat {
	
   String color;
   public Cat(){
	   
   }
   
   public Cat(String c){
	   color=c;
   }
   
   public void catchMouse(Mouse mouse){
	   System.out.println("һֻ"+color+"��èץס��"+mouse.color+"��"+mouse.size+"�������!");
   }
   
}
