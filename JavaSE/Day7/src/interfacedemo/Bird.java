package interfacedemo;

public class Bird implements Fly,Walk{

	@Override
	public void fly() {
		System.out.println("С�����...");
	}

	@Override
	public void walk() {
		System.out.println("С��ɢ��...");
		
	}

}
