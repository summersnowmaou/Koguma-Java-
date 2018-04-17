package buffer;

import java.io.*;

public class BufferedOutputStreamDemo {

	public static void main(String[] args) {
        File f=new File("c:"+File.separator+"test.txt");
        OutputStream out=null;
        BufferedOutputStream bos=null;
        try {
			out=new FileOutputStream(f,true);   // 启用追加模式
			bos=new BufferedOutputStream(out);   // 将FileOutputStream包装到BufferedOutputStream缓冲输出流
			bos.write("hello,字节缓冲输出流".getBytes());
			bos.flush();
			System.out.println("写入成功！");
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
