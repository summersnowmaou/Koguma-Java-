package memory;

import java.io.ByteArrayInputStream;
import java.io.IOException;

public class ByteArrayInputStreamDemo {

	public static void main(String[] args) {
        String data="你好，内存流";
        ByteArrayInputStream bis=new ByteArrayInputStream(data.getBytes());   // 构造方法中传入的字节数组就是要读取的字节数组
        byte[] b=new byte[1024];  // 自定义缓冲区
        try {
			int len=bis.read(b);
			System.out.println("读取的内容是："+new String(b,0,len));
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
