package stream;

import java.io.*;

public class FileWriterDemo {

	public static void main(String[] args) {
		Writer w=null;
		try {
			w=new FileWriter("c:\\test.txt");
			w.write("��ã�Java".toCharArray());   // д���ַ�����
			w.write("ABCDEFG");   // д���ַ���
			w.write('a');   // д�뵥���ַ�
			w.flush();   // ���������е�д�����ݣ�ˢ��������
			System.out.println("д��ɹ���");
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
