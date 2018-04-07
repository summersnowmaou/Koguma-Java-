package duotai.upper;

public class Student extends Person {
	private double score;

	public Student() {
	}

	public Student(String name, int age, double score) {
		super(name, age);
		this.score = score;
	}

	@Override
	public void learn() {
		System.out.println("ѧ��ѧϰ...");
	}

	public double getScore() {
		return score;
	}

	public void setScore(double score) {
		this.score = score;
	}

}
