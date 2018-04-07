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
		System.out.println(p instanceof Person);    // �ж��Ƿ���Person����
		System.out.println(p instanceof Student);  // �ж��Ƿ�����Student��Ķ���ת������

	}
	
	
	public static void method(Person per){
		if(per==null){
			System.out.println("����ֱ�Ӵ���null!");
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
