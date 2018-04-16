package stream;

import java.io.*;

public class FileReaderDemo {

	public static void main(String[] args) {
		Reader r=null;
		try {
			r=new FileReader("c:"+File.separator+"test.txt");
			int data=r.read();   // ��ȡһ���ַ�
			char c=(char)data;   // ת�����ַ�
			System.out.println("��һ�ζ�ȡ:"+c);
			char[] cbuf=new char[1024];   // �Զ��建����
			int len=r.read(cbuf);   // ��ȡ���ݷ��뻺�����У����ش��뻺�����е��ַ�����
			System.out.println("�ڶ��ζ�ȡ��"+new String(cbuf,0,len));
			
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
