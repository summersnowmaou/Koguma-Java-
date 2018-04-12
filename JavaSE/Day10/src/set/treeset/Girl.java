package set.treeset;

public class Girl implements Comparable<Girl>{
	private String name;   // ����
	private int face;    // ��ֵ
	private double money;  // ����

	public Girl() {

	}

	public Girl(String name, int face, double money) {
		super();
		this.name = name;
		this.face = face;
		this.money = money;
	}
	
	
	// �ڸ÷�����ָ���������
	@Override
	public int compareTo(Girl girl) {
		System.out.println("*****************************");
		if(girl==null){
			return 1;
		}
		if(this.face>girl.face){
			return -1;
		}else if(this.face<girl.face){
			return 1;
		}else{
			if(this.money>girl.money){
				return -1;
			}else if(this.money<girl.money){
				return 1;
			}else{
				return this.name.compareTo(girl.name);
			}
		}
		
	}

	@Override
	public String toString() {
		return "Girl [name=" + name + ", face=" + face + ", money=" + money
				+ "]";
	}

	

}
