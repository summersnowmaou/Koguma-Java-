package serial;

import java.io.File;

public class TestSerial {

	public static void main(String[] args) {
		Image image=ImageUtil.getImage("��������",new File("d:"+File.separator+"images"+File.separator+"beautiful.jpg"));
		boolean flag=ImageUtil.serialImage(image,new File("c:"+File.separator+"dfbb.txt"));
		if(flag){
			System.out.println("���л��ɹ���");
		}

	}

}
