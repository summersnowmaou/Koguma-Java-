package raf;

import java.io.*;

public class RandomAccessFileDemo {

	public static void main(String[] args) {
		File f=new File("c:"+File.separator+"test.txt");
		RandomAccessFile raf=null;
		try {
			raf=new RandomAccessFile(f,"rw");
			raf.writeBoolean(false);
			raf.writeChars("Hello");
			raf.writeChar('中');
			System.out.println("写入成功！");
			
			raf.seek(9);
		//	raf.skipBytes(9);
			System.out.println("当前文件指针位置："+raf.getFilePointer());
			System.out.println(raf.readChar());
			raf.seek(3);
			System.out.println("当前文件指针位置："+raf.getFilePointer());
			System.out.println(raf.readChar());
			raf.seek(11);
			System.out.println("当前文件指针位置："+raf.getFilePointer());
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
