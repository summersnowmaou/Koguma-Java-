package encapsulation;

public class Student {
    private String name;
    private int age;   // private修饰的属性或方法只能在本类中进行访问
    private double score;
      
	public Student() {
	}

	public Student(String name, int age, double score) {
		this.name = name;
		if(age>=1 && age<=120){
			this.age = age;
		}else{
			System.out.println("年龄无效！");
		}
		this.score = score;
	}
	
	public void setAge(int age){
		if(age>=1 && age<=120){
			this.age = age;
		}else{
			System.out.println("年龄无效！");
		}
	}
	
	public int getAge(){
		return this.age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getScore() {
		return score;
	}

	public void setScore(double score) {
		this.score = score;
	}	
    
}
