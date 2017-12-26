package day8;

public class Officer extends Person implements Drinking{
	
	public Officer() {
		super();
	}
	public Officer(String name, String sex, int age) {
		super(name, sex, age);
	} 
	public void meeting(){
		System.out.println("公务员正在开会...");
	}
	@Override
	public void love() {
		System.out.println("公务员正在谈恋爱...");
	}

	@Override
	public void drink() {
		System.out.println("公务员正在喝酒...");
	}

	@Override
	public void throwup() {
		System.out.println("公务员正在吐...");	
	}

	@Override
	public void playMad() {
		System.out.println("公务员正在耍酒疯...");	
	}
	
}
