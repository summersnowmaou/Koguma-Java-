package stream;

import java.io.*;

public class CopyImage {

	public static void main(String[] args) {
        File srcFile=new File("d:"+File.separator+"images"+File.separator+"beautiful.jpg");
        File destFile=new File("c:"+File.separator+srcFile.getName());
        copy(srcFile,destFile);
	}
	
	public static void copy(File src,File dest){
		InputStream input=null;
		OutputStream out=null;
		try {
			input=new FileInputStream(src);    // ���������ȡԴ�ļ�
			out=new FileOutputStream(dest);   // �������д��Ŀ���ļ�
			byte[] b=new byte[1024];  // �Զ��建����
			int len=0;
			// �߶���д
			while((len=input.read(b))!=-1){
				out.write(b, 0, len);
			}
			System.out.println("������ϣ�");
		} catch (Exception e) {
			e.printStackTrace();
		}finally{
			try {
				out.close();
				input.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

}
