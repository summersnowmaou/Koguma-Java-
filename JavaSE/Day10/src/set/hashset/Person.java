package set.hashset;

public class Person {
    private String name;
    private int age;
    public Person(){
    }
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	
	@Override
	public int hashCode() {
		return this.age*2;
	}
	
	@Override
	public boolean equals(Object obj) {
		if(obj==null){
			return false;
		}
		if(obj==this){
			return true;
		}
		if(!(obj instanceof Person)){
			return false;
		}
		Person per=(Person)obj;
		if(this.name!=null && this.name.equals(per.name) && this.age==per.age){
			return true;
		}
		return false;
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
	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + "]";
	}
	
}
