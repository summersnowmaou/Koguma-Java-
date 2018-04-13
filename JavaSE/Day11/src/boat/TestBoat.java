package boat;

import java.util.Scanner;

public class TestBoat {

	public static void main(String[] args) {
		Boat boat=new Boat();
		while(true){
			Scanner scan=new Scanner(System.in);
			System.out.print("请输入要加入的量：");
			int num=scan.nextInt();
			try {
				boat.load(num);
			} catch (LoadException e) {
				System.out.println(e.getMessage());
				break;
			}
			scan.close();
		}

	}

}
