package override;

public class Student extends Person{
	
	@Override
    public String getInfo(){
    	System.out.println("���෽��");
    	return "ѧ����getInfo()����";
    }
	
	@Override
	public void makeMoney(){
    	System.out.println("����������˾׬Ǯ....");
    }
    
}
