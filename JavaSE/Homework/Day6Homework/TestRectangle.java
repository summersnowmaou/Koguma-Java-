package day6;
 
public abstract class TestRectangle {

	public static void main(String[] args) {
		Rectangle a = new Rectangle(3,4);
		Rectangle b = new Rectangle(2,4);
		double c = a.getPoor(b);
		System.out.println(c);
	}

}
