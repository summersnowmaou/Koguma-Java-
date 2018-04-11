package homework;

public class Rectangle {
	private double len;
	private double width;

	public Rectangle() {

	}

	public Rectangle(double len, double width) {
		this.len = len;
		this.width = width;
	}
	
	// 计算当前对象的周长
	public double getPerimeter(){
		return (this.len+this.width)*2;
	}
	
	// 计算当前对象的面积
	public double getSize(){
		return this.len*this.width;
	}
	
	// 计算当前对象与传入参数代表的长方形的周长差
	public  double getPerimeterDiff(Rectangle r){
		double p1=this.getPerimeter();
		double p2=r.getPerimeter();
		return Math.abs(p1-p2);
	}
	

	public double getLen() {
		return len;
	}

	public void setLen(double len) {
		this.len = len;
	}

	public double getWidth() {
		return width;
	}

	public void setWidth(double width) {
		this.width = width;
	}

}
