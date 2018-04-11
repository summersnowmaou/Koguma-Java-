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
	
	// ���㵱ǰ������ܳ�
	public double getPerimeter(){
		return (this.len+this.width)*2;
	}
	
	// ���㵱ǰ��������
	public double getSize(){
		return this.len*this.width;
	}
	
	// ���㵱ǰ�����봫���������ĳ����ε��ܳ���
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
