package inner.staticdemo;

public class TestStaticInner {

	public static void main(String[] args) {
		Outer.getStaticInner().method();
		System.out.println("************************");
        Outer.StaticInner in=new Outer.StaticInner();
        in.method();
	}

}
