package day8;
 
public class TestStudent {
	public static void main(String[] args) {
		Student stu = new Student("����","��",20,"����");
		System.out.println("ѧ����Ϣ:  ����:"+stu.getName()+",�Ա�:"+stu.getSex()+",����:"+stu.getAge()+",ѧУ:"+stu.getSchool()+".");
		
		Student stu1 = new Student("����","��",20,"zz");
		Student stu2 = new Student("����","��",20,"����");
		stu.equals(null);
		System.out.println(stu.equals(stu1));
		System.out.println(stu.equals(stu2));
	}

}
