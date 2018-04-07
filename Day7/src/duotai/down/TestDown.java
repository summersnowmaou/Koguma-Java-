package duotai.down;

public class TestDown {

	public static void main(String[] args) {
		Person per=new Student("张三",20,83.5);   // 向上转型
		Student stu=(Student)per;   // 向下转型
        stu.learn();
        
	}

}
