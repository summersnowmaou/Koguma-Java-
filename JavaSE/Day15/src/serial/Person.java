package serial;

import java.io.Serializable;

public class Person implements Serializable{
	/**
	 * 添加一个控制序列化与反序列化版本一致性的serialVersionUID属性
	 */
	private static final long serialVersionUID = 1L;
	private String name;
	private int age;
	private transient String sex;   // 由transient修饰的属性不能被序列化保存
	static String job;   // 静态属性也不能被序列化保存
	

	public Person() {
	}

	public Person(String name, int age,String sex) {
		super();
		this.name = name;
		this.age = age;
		this.sex=sex;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + ", sex=" + sex + "]"+job;
	}

	


}
