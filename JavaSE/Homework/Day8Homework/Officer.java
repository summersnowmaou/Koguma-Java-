package day8;

public class Officer extends Person implements Drinking{
	
	public Officer() {
		super();
	}
	public Officer(String name, String sex, int age) {
		super(name, sex, age);
	} 
	public void meeting(){
		System.out.println("����Ա���ڿ���...");
	}
	@Override
	public void love() {
		System.out.println("����Ա����̸����...");
	}

	@Override
	public void drink() {
		System.out.println("����Ա���ںȾ�...");
	}

	@Override
	public void throwup() {
		System.out.println("����Ա������...");	
	}

	@Override
	public void playMad() {
		System.out.println("����Ա����ˣ�Ʒ�...");	
	}
	
}
