package boat;
// 自定义异常类
public class LoadException extends Exception{
   public LoadException(){
	   
   }
   
   public LoadException(String msg){
	   super(msg);
   }
}
