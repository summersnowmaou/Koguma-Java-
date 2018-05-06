package memory;

import java.io.ByteArrayOutputStream;
import java.io.IOException;

public class BoSToString {

	public static void main(String[] args) {
		ByteArrayOutputStream bos=new ByteArrayOutputStream();
		try {
			bos.write("hello world中国".getBytes());
			System.out.println("已经写入到内存中的字符串是："+bos.toString());
    	} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
