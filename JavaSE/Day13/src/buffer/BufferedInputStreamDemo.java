package buffer;

import java.io.*;

public class BufferedInputStreamDemo {

	public static void main(String[] args) {
        File f=new File("f:"+File.separator+"qmshy.mpg");
        InputStream input=null;
        BufferedInputStream bis=null;
        try {
			input=new FileInputStream(f);
			bis=new BufferedInputStream(input);   // ��FileInputStream��װ��BufferedInputStream��������
			int data=0;
			System.out.println("ʹ�û��忪ʼ��ȡ...");
			while((data=bis.read())!=-1){
			//	System.out.print((char)data);
			}
			System.out.println("ʹ�û����ȡ������");
		} catch (Exception e) {
			e.printStackTrace();
		}finally{
			try {
				bis.close();
				input.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

}
