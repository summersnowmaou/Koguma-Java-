package cat;

public class Cat {
	
   String color;
   public Cat(){
	   
   }
   
   public Cat(String c){
	   color=c;
   }
   
   public void catchMouse(Mouse mouse){
	   System.out.println("一只"+color+"的猫抓住了"+mouse.color+"、"+mouse.size+"大的老鼠!");
   }
   
}
