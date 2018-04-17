package convert;

import java.io.*;

public class OutputStreamWriterDemo {

	public static void main(String[] args) {
		OutputStream out=null;
		OutputStreamWriter osw=null;
		BufferedWriter bw=null;
		try {
			out=new FileOutputStream("c:"+File.separator+"test.txt");
			osw=new OutputStreamWriter(out);   // 将out对象包装到OutputStreamWriter对象中
			bw=new BufferedWriter(osw);    // 将osw对象包装到BufferedWriter对象中
			bw.write("hello java");
			bw.newLine();  // 换行
			bw.write("中国");
			System.out.println("写入成功！");
		} catch (Exception e) {
			e.printStackTrace();
		}finally{
			try {
				bw.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		

	}

}
