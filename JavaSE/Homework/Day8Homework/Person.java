package day8;
 
public abstract class Person {
	private String name;
	private String sex;
	private int age;
	
	public Person(){
	}
	
	public Person(String name, String sex, int age) {
		this.setName(name);
		this.sex = sex;
		this.age = age;
	}

	public abstract void love();

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
