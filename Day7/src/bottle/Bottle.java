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
			System.out.println("�Լ����Լ��ȣ���Ȼ��ȣ�");
			return true;
		}
		if(obj==null){
			System.out.println("����Ϊnull,�����");
			return false;
		}
		if(!(obj instanceof Bottle)){   // ���ݵĲ����Ƿ�����Bottle��
			System.out.println("���ݵĲ���Bottle����");
			return false;
		}
		Bottle bottle=(Bottle)obj;   // ����ת��
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
