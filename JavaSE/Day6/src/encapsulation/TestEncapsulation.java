package encapsulation;

public class TestEncapsulation {

	public static void main(String[] args) {
		Student stu=new Student("����",60,65);
		//stu.age=500;
		stu.setAge(62);
        System.out.println("�����ǣ�"+stu.getAge());
	}

}
