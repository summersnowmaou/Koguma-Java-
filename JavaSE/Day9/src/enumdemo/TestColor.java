package enumdemo;

public class TestColor {

	public static void main(String[] args) {
		ColorEnum r=ColorEnum.RED;
		System.out.println(r);
		System.out.println("��������ö�ٶ���");
		for(ColorEnum c:ColorEnum.values()){
			System.out.print(c+"  ");
		}

	}

}
