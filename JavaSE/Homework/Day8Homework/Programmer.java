package day8;
 
public class Programmer extends Person implements Learning{
	
	public void coding(){
		System.out.println("����Գ����д����...");
	}
	
	public void debuging(){
		System.out.println("����Գ������bug...");
	}
	
	@Override
	public void love() {
		System.out.println("����Գ����̸����...");
	}

	@Override
	public void preLearn() {
		System.out.println("����Գ����Ԥϰ...");
	}

	@Override
	public void lessons() {
		System.out.println("����Գ�����Ͽ�...");
	}

	@Override
	public void review() {
		System.out.println("����Գ���ڸ�ϰ...");
	}

	public Programmer() {
		super();
	}

	public Programmer(String name, String sex, int age) {
		super(name, sex, age);
	}

}
