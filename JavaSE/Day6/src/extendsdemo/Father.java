package extendsdemo;

public class Father {
	int n;

	public Father() {
		System.out.println("父类无参构造");
	}

	public Father(int n) {
		this.n = n;
		System.out.println("父类带参构造");
	}

}
