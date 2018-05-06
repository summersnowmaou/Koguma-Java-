package memory;

import java.io.*;

public class ByteArrayOutputStreamDemo {

	public static void main(String[] args) {
		File srcFile=new File("d:"+File.separator+"images"+File.separator+"gg.jpg");
		File destFile=new File("c:"+File.separator+srcFile.getName());
		InputStream input=null;
		OutputStream out=null;
		ByteArrayOutputStream bos=new ByteArrayOutputStream();   // д���ڴ��е��ڴ������
		try {
			input=new FileInputStream(srcFile);   // ��ȡԴ�ļ���������
			out=new FileOutputStream(destFile);  // д��Ŀ���ļ��������
			byte[] b=new byte[1024];
			int len=0;
			while((len=input.read(b))!=-1){
				bos.write(b, 0, len);    // ����д���ڴ���
			}
			byte[] data=bos.toByteArray();   // ����һ���·�����ֽ����顣���Ĵ�С�����������ĵ�ǰ��С�ͻ���������Ч���ݵĸ���
			out.write(data);   // ��ͼƬ����һ����д��Ŀ���ļ���
			System.out.println("д��ɹ���");
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
