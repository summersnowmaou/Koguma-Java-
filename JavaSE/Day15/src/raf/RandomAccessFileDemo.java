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
			raf.writeChar('��');
			System.out.println("д��ɹ���");
			
			raf.seek(9);
		//	raf.skipBytes(9);
			System.out.println("��ǰ�ļ�ָ��λ�ã�"+raf.getFilePointer());
			System.out.println(raf.readChar());
			raf.seek(3);
			System.out.println("��ǰ�ļ�ָ��λ�ã�"+raf.getFilePointer());
			System.out.println(raf.readChar());
			raf.seek(11);
			System.out.println("��ǰ�ļ�ָ��λ�ã�"+raf.getFilePointer());
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
