package abstractdemo;

public class Cat extends Animal {
	private String fur;
	
	public Cat(){
	}
	
	public Cat(String name, String food,String fur){
		super(name,food);
		this.fur=fur;
	}

	@Override
	public void eat() {
        System.out.println("–°√®≥‘”„...");
	}

	public String getFur() {
		return fur;
	}

	public void setFur(String fur) {
		this.fur = fur;
	}
	
}
