package convert;

import java.io.*;

public class DecodeDemo {

	public static void main(String[] args) {
		InputStream input=null;
        InputStreamReader isr=null;
        try {
			input=new FileInputStream("c:"+File.separator+"test.txt");
			isr=new InputStreamReader(input,"utf-8");  // 指定InputStreamReader的编码
			char[] c=new char[1024];
			int len=isr.read(c);
			System.out.println("读取的内容是："+new String(c,0,len));
		} catch (Exception e) {
			e.printStackTrace();
		}finally{
			try {
				isr.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

}
