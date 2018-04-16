package stream;

import java.io.*;

public class FileReaderDemo {

	public static void main(String[] args) {
		Reader r=null;
		try {
			r=new FileReader("c:"+File.separator+"test.txt");
			int data=r.read();   // 读取一个字符
			char c=(char)data;   // 转换成字符
			System.out.println("第一次读取:"+c);
			char[] cbuf=new char[1024];   // 自定义缓冲区
			int len=r.read(cbuf);   // 读取数据放入缓冲区中，返回存入缓冲区中的字符个数
			System.out.println("第二次读取："+new String(cbuf,0,len));
			
		} catch (Exception e) {
			e.printStackTrace();
		}finally{
			try {
				r.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

	}

}
