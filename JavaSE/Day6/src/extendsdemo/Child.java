package extendsdemo;

public class Child extends Father {
	//private int n;

	public Child() {
		super(300);
		System.out.println("�����޲ι���");
	}

	public Child(int n) {
		this.n = n;
		System.out.println("������ι��죺"+n);
	}
	
	public int getN() {
		return n;
	}

}
