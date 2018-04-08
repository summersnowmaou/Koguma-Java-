package string.trap;

public class PersonTest {

	public static void main(String[] args) {
		Person per=new Person("张三");
		changePerson(per);
        System.out.println(per);
	}
	
	public static void changePerson(Person per){
		per.setName("李四");
	}

}
