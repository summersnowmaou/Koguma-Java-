package day8;

public class Client {
	
	public static void method1(Object obj) {
		if(obj==null) {
			System.out.println("����Ķ���ΪNULL");
		}else if(obj instanceof Student) {
			((Student) obj).chatting();
		}else if(obj instanceof Officer) {
			((Officer) obj).meeting();
		}else if(obj instanceof Programmer) {
			((Programmer) obj).coding();
			((Programmer) obj).debuging();
		}else {
			System.out.println("���벻�Ϸ�...");
		}
	}
	
	public static void main(String[] args) {
		Student stu = new Student("����","��",20,"����");
		Officer off = new Officer("����","��",20);
		Programmer pro = new Programmer("����","��",20);
		method1(stu);
		method1(off);
		method1(pro);
	}
}
