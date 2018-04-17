package buffer;

import java.io.*;

public class BufferedReaderDemo {

	public static void main(String[] args) {
		File f=new File("c:"+File.separator+"test.txt");
		int count=0;
		Reader r=null;
		BufferedReader br=null;
		try {
			r=new FileReader(f);
			br=new BufferedReader(r);   // 使用BufferedReader包装FileReader
			String line="";  // 存储获取到的行内容
			while((line=br.readLine())!=null){
				count++;
				System.out.println(count+"\t"+line);
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			try {
				br.close();
				r.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

	}

}
