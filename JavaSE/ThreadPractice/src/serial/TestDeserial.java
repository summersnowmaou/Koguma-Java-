package serial;

import java.io.*;

public class TestDeserial {

	public static void main(String[] args)throws Exception {
		Image image=ImageUtil.deserialImage(new File("c:"+File.separator+"dfbb.txt"));
		System.out.println("���ߣ�"+image.getAuthor());
		File f=new File("c:"+File.separator+"dfbb.jpg");
		OutputStream out=new FileOutputStream(f);
		out.write(image.getData());
		out.close();
		System.out.println("�����л��ɹ���");

	}

}
