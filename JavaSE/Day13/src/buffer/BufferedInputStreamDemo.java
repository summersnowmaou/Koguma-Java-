package buffer;

import java.io.*;

public class BufferedInputStreamDemo {

	public static void main(String[] args) {
        File f=new File("f:"+File.separator+"qmshy.mpg");
        InputStream input=null;
        BufferedInputStream bis=null;
        try {
			input=new FileInputStream(f);
			bis=new BufferedInputStream(input);   // 将FileInputStream包装到BufferedInputStream缓冲流中
			int data=0;
			System.out.println("使用缓冲开始读取...");
			while((data=bis.read())!=-1){
			//	System.out.print((char)data);
			}
			System.out.println("使用缓冲读取结束！");
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
