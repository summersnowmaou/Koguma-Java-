package decorator;
/*
 * 具体装饰角色
 * */
public class ConcreteDecorator extends Decorator{
	
   public ConcreteDecorator(Love love){
	   super(love);
   }
   
   public void beautifulLove(){
	   System.out.println("送花...");
	   super.love();
	   System.out.println("结婚...");
   }
}
