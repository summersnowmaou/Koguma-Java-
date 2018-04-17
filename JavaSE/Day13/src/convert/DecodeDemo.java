package convert;

import java.io.*;

public class DecodeDemo {

	public static void main(String[] args) {
		InputStream input=null;
        InputStreamReader isr=null;
        try {
			input=new FileInputStream("c:"+File.separator+"test.txt");
			isr=new InputStreamReader(input,"utf-8");  // ָ��InputStreamReader�ı���
			char[] c=new char[1024];
			int len=isr.read(c);
			System.out.println("��ȡ�������ǣ�"+new String(c,0,len));
		} catch (Exception e) {
			e.printStackTrace();
		}finally{
			try {
				isr.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

}
