package stream;

import java.io.*;

public class FileOutputStreamDemo {

	public static void main(String[] args) {
		File f=new File("c:"+File.separator+"test.txt");
		OutputStream out=null;
		try {
			out=new FileOutputStream(f,true);   // 开启追加模式
			out.write("中华人民共和国".getBytes());   // 直接写入一个字节数组
			
			String data="大宋王朝";
			byte[] b=data.getBytes();
			out.write(b,0,8);   // 使用三参的write(xxx)方法进行写入
			System.out.println(f.length());
			System.out.println("写入成功！");
		} catch (Exception e) {
			e.printStackTrace();
		}finally{
			try {
				out.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

	}

}
