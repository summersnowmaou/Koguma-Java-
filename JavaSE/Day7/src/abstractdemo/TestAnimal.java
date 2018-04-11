package abstractdemo;

public class TestAnimal {
    public static void main(String[] args) {
		Animal animal1=new Cat();   // 由猫对象向上转型
		Animal animal2=new Dog();   // 由狗对象向上转型
		animal1.eat();
		animal2.eat();
	}
}
