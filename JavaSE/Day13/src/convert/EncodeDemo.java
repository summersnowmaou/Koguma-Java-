package convert;

import java.io.*;

public class EncodeDemo {

	public static void main(String[] args) {
		OutputStream out=null;
		OutputStreamWriter osw=null;
		try {
			out=new FileOutputStream("c:"+File.separator+"test.txt");
			osw=new OutputStreamWriter(out,"utf-8");   // ��OutputStreamWriter���ñ���
			osw.write("�л����񹲺͹�");
			osw.flush();
			System.out.println("д��ɹ���");
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
