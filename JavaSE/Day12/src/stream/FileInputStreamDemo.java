package stream;

import java.io.*;

public class FileInputStreamDemo {

	public static void main(String[] args) {
		File f=new File("c:"+File.separator+"test.txt");
		InputStream input=null;
		try {
			input=new FileInputStream(f);
			/**
			 * ÿ�ζ�ȡһ���ֽ�����
			int data=0;
			while((data=input.read())!=-1){
				byte b=(byte)data;
				byte[] array=new byte[1];
				array[0]=b;
				String str=new String(array);
				System.out.print(str);
			}**/
			byte[] b=new byte[1024];   // �Զ��建����(��������)
			int len=input.read(b);   // ��ȡ���ݵ�byte[]�����У����ض��뵽byte[]�����е��ֽ���
			System.out.println("��ȡ�������ǣ�"+new String(b,0,len));
		}catch(Exception e) {
			e.printStackTrace();
		}finally{
			try {
				input.close();   // �ر���
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

	}

}
