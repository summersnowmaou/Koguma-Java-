package stream;

import java.io.*;

public class FileWriterDemo {

	public static void main(String[] args) {
		Writer w=null;
		try {
			w=new FileWriter("c:\\test.txt");
			w.write("你好，Java".toCharArray());   // 写入字符数组
			w.write("ABCDEFG");   // 写入字符串
			w.write('a');   // 写入单个字符
			w.flush();   // 将缓冲区中的写入内容，刷到磁盘上
			System.out.println("写入成功！");
		} catch (IOException e) {
			e.printStackTrace();
		}finally{
			try {
				w.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

	}

}
