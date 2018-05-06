package serial;

import java.io.Serializable;

public class Person implements Serializable{
	/**
	 * ���һ���������л��뷴���л��汾һ���Ե�serialVersionUID����
	 */
	private static final long serialVersionUID = 1L;
	private String name;
	private int age;
	private transient String sex;   // ��transient���ε����Բ��ܱ����л�����
	static String job;   // ��̬����Ҳ���ܱ����л�����
	

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
