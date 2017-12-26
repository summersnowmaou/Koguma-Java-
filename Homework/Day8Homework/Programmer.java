package day8;
 
public class Programmer extends Person implements Learning{
	
	public void coding(){
		System.out.println("程序猿正在写代码...");
	}
	
	public void debuging(){
		System.out.println("程序猿正在修bug...");
	}
	
	@Override
	public void love() {
		System.out.println("程序猿正在谈恋爱...");
	}

	@Override
	public void preLearn() {
		System.out.println("程序猿正在预习...");
	}

	@Override
	public void lessons() {
		System.out.println("程序猿正在上课...");
	}

	@Override
	public void review() {
		System.out.println("程序猿正在复习...");
	}

	public Programmer() {
		super();
	}

	public Programmer(String name, String sex, int age) {
		super(name, sex, age);
	}

}
