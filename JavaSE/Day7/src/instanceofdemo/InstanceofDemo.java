package instanceofdemo;

public class InstanceofDemo {

	public static void main(String[] args) {
		Student stu=new Student();
		Farmer f=new Farmer();
		method(null);
		method(stu);
		method(f);
		System.out.println("********************");
		Person p=new Student();
		System.out.println(p instanceof Person);    // 判断是否是Person类型
		System.out.println(p instanceof Student);  // 判断是否是由Student类的对象转换而来

	}
	
	
	public static void method(Person per){
		if(per==null){
			System.out.println("不能直接传递null!");
			return;
		}
		if(per instanceof Student){
			Student stu=(Student)per;
			stu.learn();
		}
		if(per instanceof Farmer){
			Farmer f=(Farmer)per;
			f.plant();
		}
	}

}
