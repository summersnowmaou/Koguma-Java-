package override;

public class Person {
    public Object getInfo(){
    	System.out.println("Person父类的getInfo()方法");
    	return "我是父类中的方法";
    }
    
    
    public  void makeMoney(){
    	System.out.println("开工厂赚钱....");
    }
}
