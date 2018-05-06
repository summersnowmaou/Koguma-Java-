package raf;

import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;

public class RafString {

	public static void main(String[] args) {
		File f=new File("c:"+File.separator+"test.txt");
		RandomAccessFile raf=null;
		try {
			raf=new RandomAccessFile(f,"rw");
			raf.writeBytes("中华人民共和国");   // 会丢弃高八位的方式写入字符串的每个字符
			raf.writeChars("小王子"); // writeChars(xx)将字符串中的每个字符以两个字节的形式写入  
			raf.seek(7);    // 设置文件指针的位置
			System.out.println(raf.readChar());
		} catch (Exception e) {
			e.printStackTrace();
		}finally{
			try {
				raf.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

	}

}
