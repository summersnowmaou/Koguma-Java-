package boxing;

public class CharacterDemo {

	public static void main(String[] args) {
	    Character c='a';   // 自动装箱
	    char x=c;  // 自动拆箱
	    System.out.println("变为大写："+Character.toUpperCase('a'));
	    System.out.println("变为小写："+Character.toLowerCase('Y'));

	}
	

}
