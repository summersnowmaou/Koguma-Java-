package encapsulation;

public class Student {
    private String name;
    private int age;   // private���ε����Ի򷽷�ֻ���ڱ����н��з���
    private double score;
      
	public Student() {
	}

	public Student(String name, int age, double score) {
		this.name = name;
		if(age>=1 && age<=120){
			this.age = age;
		}else{
			System.out.println("������Ч��");
		}
		this.score = score;
	}
	
	public void setAge(int age){
		if(age>=1 && age<=120){
			this.age = age;
		}else{
			System.out.println("������Ч��");
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
