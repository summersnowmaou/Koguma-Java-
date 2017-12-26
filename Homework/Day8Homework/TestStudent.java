package day8;
 
public class TestStudent {
	public static void main(String[] args) {
		Student stu = new Student("张三","男",20,"北大");
		System.out.println("学生信息:  姓名:"+stu.getName()+",性别:"+stu.getSex()+",年龄:"+stu.getAge()+",学校:"+stu.getSchool()+".");
		
		Student stu1 = new Student("李四","男",20,"zz");
		Student stu2 = new Student("张三","男",20,"北大");
		stu.equals(null);
		System.out.println(stu.equals(stu1));
		System.out.println(stu.equals(stu2));
	}

}
