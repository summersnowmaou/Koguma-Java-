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
		System.out.println("学生和朋友聊微信...");
	}
	@Override
	public boolean equals(Object obj){
		
		if(this==obj){
			System.out.println("同一个学生比吗...");
			return true;
		}
		if(obj==null){
			System.out.println("传递的参数为NULL");
			return false;
		}
		if(!(obj instanceof Student)){
			System.out.println("传递的不是Student对象");
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
		System.out.print("学生预习...");
		
	}

	@Override
	public void lessons() {
		System.out.print("学生上课...");
		
	}

	@Override
	public void review() {
		System.out.print("学生复习...");
		
	}

	@Override
	public void love() {
		System.out.print("学生谈恋爱...");
		
	}

}
