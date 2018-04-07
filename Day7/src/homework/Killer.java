package homework;

public class Killer {
	private String name;

	public Killer() {

	}

	public Killer(String name) {
		this.name = name;
	}
	
	public void attack(President pre){
		System.out.println(this.name+"´ÌÉ±ÁË×ÜÍ³"+pre.getName());
	}

}
