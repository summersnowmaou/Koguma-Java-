package override;

public class Student extends Person{
	
	@Override
    public String getInfo(){
    	System.out.println("子类方法");
    	return "学生的getInfo()方法";
    }
	
	@Override
	public void makeMoney(){
    	System.out.println("开互联网公司赚钱....");
    }
    
}
