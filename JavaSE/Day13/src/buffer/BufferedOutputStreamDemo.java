package buffer;

import java.io.*;

public class BufferedOutputStreamDemo {

	public static void main(String[] args) {
        File f=new File("c:"+File.separator+"test.txt");
        OutputStream out=null;
        BufferedOutputStream bos=null;
        try {
			out=new FileOutputStream(f,true);   // ����׷��ģʽ
			bos=new BufferedOutputStream(out);   // ��FileOutputStream��װ��BufferedOutputStream���������
			bos.write("hello,�ֽڻ��������".getBytes());
			bos.flush();
			System.out.println("д��ɹ���");
		} catch (Exception e) {
			e.printStackTrace();
		}finally{
			try {
				bos.close();
				out.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

}
