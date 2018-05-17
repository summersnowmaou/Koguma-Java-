package serial;

import java.io.File;

public class TestSerial {

	public static void main(String[] args) {
		Image image=ImageUtil.getImage("东方不败",new File("d:"+File.separator+"images"+File.separator+"beautiful.jpg"));
		boolean flag=ImageUtil.serialImage(image,new File("c:"+File.separator+"dfbb.txt"));
		if(flag){
			System.out.println("序列化成功！");
		}

	}

}
