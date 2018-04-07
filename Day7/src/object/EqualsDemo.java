package object;

public class EqualsDemo {

	public static void main(String[] args) {
		Student stu1=new Student("张三",20,83.5);
		Student stu2=new Student("张三",20,83.5);
		System.out.println("stu1与stu2相等吗？"+stu1.equals(stu2));
		
	}

}
