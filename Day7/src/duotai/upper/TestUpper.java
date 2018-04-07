package duotai.upper;

public class TestUpper {

	public static void main(String[] args) {
		Student stu=new Student("张三",20,83.5);
		Person per=stu;   // 向上转型
		per.say();
		per.learn();

	}

}
