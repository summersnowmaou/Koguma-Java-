package object;

public class EqualsDemo {

	public static void main(String[] args) {
		Student stu1=new Student("����",20,83.5);
		Student stu2=new Student("����",20,83.5);
		System.out.println("stu1��stu2�����"+stu1.equals(stu2));
		
	}

}
