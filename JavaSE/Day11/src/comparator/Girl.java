package comparator;

public class Girl {
	private String name;
	private int face;
	private double money;

	public Girl() {
	}

	public Girl(String name, int face, double money) {
		super();
		this.name = name;
		this.face = face;
		this.money = money;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getFace() {
		return face;
	}

	public void setFace(int face) {
		this.face = face;
	}

	public double getMoney() {
		return money;
	}

	public void setMoney(double money) {
		this.money = money;
	}

	@Override
	public String toString() {
		return "Girl [name=" + name + ", face=" + face + ", money=" + money
				+ "]";
	}

}
