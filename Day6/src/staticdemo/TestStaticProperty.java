package staticdemo;

public class TestStaticProperty {

	public static void main(String[] args) {
		Person per1=new Person("����",20);
		Person per2=new Person("����",22);
		per1.say();
		per2.say();
		System.out.println("��ǰһ����"+Person.count+"��");

	}

}
