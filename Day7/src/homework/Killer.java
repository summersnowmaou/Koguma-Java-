package homework;

public class Killer {
	private String name;

	public Killer() {

	}

	public Killer(String name) {
		this.name = name;
	}
	
	public void attack(President pre){
		System.out.println(this.name+"��ɱ����ͳ"+pre.getName());
	}

}
