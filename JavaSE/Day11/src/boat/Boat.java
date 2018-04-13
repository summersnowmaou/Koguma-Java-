package boat;

public class Boat {
   private static final int MAX_STORE=1000;   // 船的最大载重量
   
   private int currentStore;    // 当前载货量
   
   // 添加货物的方法
   public void load(int num)throws LoadException{
	   System.out.println("载货之前的当前载货量："+currentStore);
	   this.currentStore+=num;  // 模拟装载货物
	   System.out.println("载货之后的当前载货量："+currentStore);
	   if(this.currentStore>MAX_STORE){
		   throw new LoadException("货物已经超过最大载重量，船被压坏了！");
	   }
   }
   
}
