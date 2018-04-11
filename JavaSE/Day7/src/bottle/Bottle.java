package bottle;

public class Bottle {
	private String color;
	private int size;

	public Bottle() {

	}

	public Bottle(String color, int size) {
		super();
		this.color = color;
		this.size = size;
	}
	
	@Override
	public boolean equals(Object obj) {
		if(this==obj){
			System.out.println("自己跟自己比，当然相等！");
			return true;
		}
		if(obj==null){
			System.out.println("参数为null,不相等");
			return false;
		}
		if(!(obj instanceof Bottle)){   // 传递的参数是否属于Bottle类
			System.out.println("传递的不是Bottle对象");
			return false;
		}
		Bottle bottle=(Bottle)obj;   // 向下转型
		if(this.color!=null && this.color.equals(bottle.color) && this.size==bottle.size){
			return true;
		}
		return false;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}

}
