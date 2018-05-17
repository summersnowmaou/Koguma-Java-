package serial;

import java.io.*;

public class TestDeserial {

	public static void main(String[] args)throws Exception {
		Image image=ImageUtil.deserialImage(new File("c:"+File.separator+"dfbb.txt"));
		System.out.println("作者："+image.getAuthor());
		File f=new File("c:"+File.separator+"dfbb.jpg");
		OutputStream out=new FileOutputStream(f);
		out.write(image.getData());
		out.close();
		System.out.println("反序列化成功！");

	}

}
