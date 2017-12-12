package day6;
 
public class Rectangle {
	int length;
	int width;
	
	public Rectangle() {
	}
	
	public Rectangle(int length,int width) {
		this.length = length;
		this.width = width;
	}
	
	public double getArea(int length,int width) {
		return length*width;
	}
	
	public double getPerimeter(int length,int width) {
		return (length+width)*2;
	}
	
	public double getPoor(Rectangle a) {
		return this.getPerimeter(this.length,this. width)-a.getPerimeter(a.length, a.width);
	}
	
}
