package convert;

import java.io.*;

public class OutputStreamWriterDemo {

	public static void main(String[] args) {
		OutputStream out=null;
		OutputStreamWriter osw=null;
		BufferedWriter bw=null;
		try {
			out=new FileOutputStream("c:"+File.separator+"test.txt");
			osw=new OutputStreamWriter(out);   // ��out�����װ��OutputStreamWriter������
			bw=new BufferedWriter(osw);    // ��osw�����װ��BufferedWriter������
			bw.write("hello java");
			bw.newLine();  // ����
			bw.write("�й�");
			System.out.println("д��ɹ���");
		} catch (Exception e) {
			e.printStackTrace();
		}finally{
			try {
				bw.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		

	}

}
