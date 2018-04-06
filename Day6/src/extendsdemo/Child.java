package extendsdemo;

public class Child extends Father {
	//private int n;

	public Child() {
		super(300);
		System.out.println("子类无参构造");
	}

	public Child(int n) {
		this.n = n;
		System.out.println("子类带参构造："+n);
	}
	
	public int getN() {
		return n;
	}

}
