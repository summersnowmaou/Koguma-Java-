package stream;

import java.io.*;

public class FileOutputStreamDemo {

	public static void main(String[] args) {
		File f=new File("c:"+File.separator+"test.txt");
		OutputStream out=null;
		try {
			out=new FileOutputStream(f,true);   // ����׷��ģʽ
			out.write("�л����񹲺͹�".getBytes());   // ֱ��д��һ���ֽ�����
			
			String data="��������";
			byte[] b=data.getBytes();
			out.write(b,0,8);   // ʹ�����ε�write(xxx)��������д��
			System.out.println(f.length());
			System.out.println("д��ɹ���");
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
