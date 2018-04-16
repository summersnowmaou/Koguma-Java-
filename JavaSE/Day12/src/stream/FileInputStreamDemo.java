package stream;

import java.io.*;

public class FileInputStreamDemo {

	public static void main(String[] args) {
		File f=new File("c:"+File.separator+"test.txt");
		InputStream input=null;
		try {
			input=new FileInputStream(f);
			/**
			 * 每次读取一个字节数据
			int data=0;
			while((data=input.read())!=-1){
				byte b=(byte)data;
				byte[] array=new byte[1];
				array[0]=b;
				String str=new String(array);
				System.out.print(str);
			}**/
			byte[] b=new byte[1024];   // 自定义缓冲区(“卡车”)
			int len=input.read(b);   // 读取数据到byte[]数组中，返回读入到byte[]数组中的字节数
			System.out.println("读取的内容是："+new String(b,0,len));
		}catch(Exception e) {
			e.printStackTrace();
		}finally{
			try {
				input.close();   // 关闭流
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

	}

}
