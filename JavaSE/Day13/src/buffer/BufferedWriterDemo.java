package buffer;

import java.io.*;

public class BufferedWriterDemo {

	public static void main(String[] args) {
		File f=new File("c:"+File.separator+"test.txt");
		Writer w=null;
		BufferedWriter bw=null;
		try {
			w=new FileWriter(f,true);
			bw=new BufferedWriter(w);   // ��FileWriter��װ��BufferedWriter��
			bw.write("�����յ���");
			bw.newLine();   // д�뻻��
			bw.write("���κ�����");
			bw.newLine();  // д�뻻��
			bw.write("˭֪���в�");
			bw.newLine();  // д�뻻��
			bw.write("����������");
			bw.newLine();  // д�뻻��
			bw.flush();    // ���뵽����
			System.out.println("д��ɹ���");
			
		} catch (IOException e) {
			e.printStackTrace();
		}finally{
			try {
				bw.close();
				w.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		

	}

}
