package bottle;
import instanceofdemo.*;
public class TestBottle {

	public static void main(String[] args) {
		Person per=new Person();
		Bottle bottle1=new Bottle("yellow",10);
		Bottle bottle2=new Bottle("blue",20);
		Bottle bottle3=new Bottle("yellow",10);
		bottle1.equals(null);
		bottle1.equals(per);
		bottle1.equals(bottle1);
		boolean flag1=bottle1.equals(bottle2);
		if(flag1){
			System.out.println("瓶子1与瓶子2相等");
		}else{
			System.out.println("瓶子1与瓶子2不相等");
		}
		System.out.println(bottle1.equals(bottle3)?"瓶子1与瓶子3相等":"瓶子1与瓶子3不相等");

	}

}
