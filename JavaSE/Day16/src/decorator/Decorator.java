package decorator;
/*
 * 抽象装饰角色
 * */
public abstract class Decorator implements Love{
   private Love love;   // 持有抽象构建角色的引用
   
   public Decorator(Love love){
	   this.love=love;
   }
   
   @Override
   public void love() {
	  this.love.love();		
   }
   
}
