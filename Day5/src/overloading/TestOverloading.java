package overloading;

public class TestOverloading {

	public static void main(String[] args) {
		Person per=new Person();
		per.say();
		Person per2=new Person("������ ",20);
		per2.say();
		
		new Person("��������",22,"Ů").say();

	}

}
