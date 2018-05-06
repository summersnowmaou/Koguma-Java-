package decorator;

public class TestDecorator {

	public static void main(String[] args) {
		Student stu=new Student();
		Decorator decorator=new Decorator(stu);
        decorator.love();
	}

}
