package duotai.upper;

public class TestUpper {

	public static void main(String[] args) {
		Student stu=new Student("����",20,83.5);
		Person per=stu;   // ����ת��
		per.say();
		per.learn();

	}

}
