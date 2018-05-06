package memory;

import java.io.*;

public class ByteArrayOutputStreamDemo {

	public static void main(String[] args) {
		File srcFile=new File("d:"+File.separator+"images"+File.separator+"gg.jpg");
		File destFile=new File("c:"+File.separator+srcFile.getName());
		InputStream input=null;
		OutputStream out=null;
		ByteArrayOutputStream bos=new ByteArrayOutputStream();   // 写入内存中的内存输出流
		try {
			input=new FileInputStream(srcFile);   // 读取源文件的输入流
			out=new FileOutputStream(destFile);  // 写入目标文件的输出流
			byte[] b=new byte[1024];
			int len=0;
			while((len=input.read(b))!=-1){
				bos.write(b, 0, len);    // 不断写入内存中
			}
			byte[] data=bos.toByteArray();   // 创建一个新分配的字节数组。它的大小是这个输出流的当前大小和缓冲区的有效内容的副本
			out.write(data);   // 将图片数据一次性写入目标文件中
			System.out.println("写入成功！");
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
