package enumdemo;

public class TestColor {

	public static void main(String[] args) {
		ColorEnum r=ColorEnum.RED;
		System.out.println(r);
		System.out.println("遍历所有枚举对象：");
		for(ColorEnum c:ColorEnum.values()){
			System.out.print(c+"  ");
		}

	}

}
