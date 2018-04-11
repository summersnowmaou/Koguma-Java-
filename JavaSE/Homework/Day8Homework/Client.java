package day8;

public class Client {
	
	public static void method1(Object obj) {
		if(obj==null) {
			System.out.println("输入的对象为NULL");
		}else if(obj instanceof Student) {
			((Student) obj).chatting();
		}else if(obj instanceof Officer) {
			((Officer) obj).meeting();
		}else if(obj instanceof Programmer) {
			((Programmer) obj).coding();
			((Programmer) obj).debuging();
		}else {
			System.out.println("输入不合法...");
		}
	}
	
	public static void main(String[] args) {
		Student stu = new Student("张三","男",20,"北大");
		Officer off = new Officer("李四","男",20);
		Programmer pro = new Programmer("王五","男",20);
		method1(stu);
		method1(off);
		method1(pro);
	}
}
