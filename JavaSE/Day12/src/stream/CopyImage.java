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
			input=new FileInputStream(src);    // 用这个流读取源文件
			out=new FileOutputStream(dest);   // 用这个流写入目标文件
			byte[] b=new byte[1024];  // 自定义缓冲区
			int len=0;
			// 边读边写
			while((len=input.read(b))!=-1){
				out.write(b, 0, len);
			}
			System.out.println("复制完毕！");
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
