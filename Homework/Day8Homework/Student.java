package day8;
 
public class Student extends Person implements Learning {
	
	private String school;
	
	
	public String getSchool() {
		return school;
	}

	public void setSchool(String school) {
		this.school = school;
	}
	
	public Student(){
		super();
	}
	
	public Student(String name,String sex,int age,String school) {
		super(name,sex,age);
		this.school = school;
	}
	
	public void chatting(){
		System.out.println("ѧ����������΢��...");
	}
	@Override
	public boolean equals(Object obj){
		
		if(this==obj){
			System.out.println("ͬһ��ѧ������...");
			return true;
		}
		if(obj==null){
			System.out.println("���ݵĲ���ΪNULL");
			return false;
		}
		if(!(obj instanceof Student)){
			System.out.println("���ݵĲ���Student����");
			return false;
		}
		Student stu = (Student)obj;
		if(this.school!=null && this.school.equals(stu.school) && this.getName().equals(stu.getName()) && this.getSex().equals(stu.getSex())&& (this.getAge()==stu.getAge())) {
			return true;
		}
		return false;
	}
	@Override
	public void preLearn() {
		System.out.print("ѧ��Ԥϰ...");
		
	}

	@Override
	public void lessons() {
		System.out.print("ѧ���Ͽ�...");
		
	}

	@Override
	public void review() {
		System.out.print("ѧ����ϰ...");
		
	}

	@Override
	public void love() {
		System.out.print("ѧ��̸����...");
		
	}

}
