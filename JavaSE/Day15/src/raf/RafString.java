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
			raf.writeBytes("�л����񹲺͹�");   // �ᶪ���߰�λ�ķ�ʽд���ַ�����ÿ���ַ�
			raf.writeChars("С����"); // writeChars(xx)���ַ����е�ÿ���ַ��������ֽڵ���ʽд��  
			raf.seek(7);    // �����ļ�ָ���λ��
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
