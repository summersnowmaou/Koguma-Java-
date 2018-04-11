package instanceofdemo;

public class Student extends Person {
	private double score;

	public Student() {
	}

	public Student(String name, int age, double score) {
		super(name, age);
		this.score = score;
	}

	
	public void learn() {
		System.out.println("Ñ§ÉúÑ§Ï°...");
	}

	public double getScore() {
		return score;
	}

	public void setScore(double score) {
		this.score = score;
	}

}
