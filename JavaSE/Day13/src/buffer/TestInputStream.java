package buffer;

import java.io.*;

public class TestInputStream {

	public static void main(String[] args)throws Exception {
		Reader input=new FileReader(new File("c:"+File.separator+"test.txt"));
		char[] c=new char[1024];
		int len=input.read(c);
		System.out.println(new String(c,0,len));
		input.close();

	}

}
