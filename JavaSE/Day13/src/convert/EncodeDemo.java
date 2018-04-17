package convert;

import java.io.*;

public class EncodeDemo {

	public static void main(String[] args) {
		OutputStream out=null;
		OutputStreamWriter osw=null;
		try {
			out=new FileOutputStream("c:"+File.separator+"test.txt");
			osw=new OutputStreamWriter(out,"utf-8");   // 对OutputStreamWriter设置编码
			osw.write("中华人民共和国");
			osw.flush();
			System.out.println("写入成功！");
		} catch (Exception e) {
			e.printStackTrace();
		}finally{
			try {
				osw.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		

	}

}
