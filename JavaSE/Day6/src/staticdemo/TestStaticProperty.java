package staticdemo;

public class TestStaticProperty {

	public static void main(String[] args) {
		Person per1=new Person("张三",20);
		Person per2=new Person("李四",22);
		per1.say();
		per2.say();
		System.out.println("当前一共有"+Person.count+"人");

	}

}
