package abstractdemo;

public class Dog extends Animal {
	private String color;
	
	public Dog(){
	}
	
	public Dog(String name, String food,String color){
		super(name,food);
		this.color=color;
	}

	@Override
	public void eat() {
        System.out.println("Ð¡¹·¿Ð¹ÇÍ·...");
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}
	
}
