package decorator;
/*
 * ����װ�ν�ɫ
 * */
public class ConcreteDecorator extends Decorator{
	
   public ConcreteDecorator(Love love){
	   super(love);
   }
   
   public void beautifulLove(){
	   System.out.println("�ͻ�...");
	   super.love();
	   System.out.println("���...");
   }
}
