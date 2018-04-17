package buffer;

import java.io.*;

public class BufferedWriterDemo {

	public static void main(String[] args) {
		File f=new File("c:"+File.separator+"test.txt");
		Writer w=null;
		BufferedWriter bw=null;
		try {
			w=new FileWriter(f,true);
			bw=new BufferedWriter(w);   // 将FileWriter包装到BufferedWriter中
			bw.write("锄禾日当午");
			bw.newLine();   // 写入换行
			bw.write("汗滴禾下土");
			bw.newLine();  // 写入换行
			bw.write("谁知盘中餐");
			bw.newLine();  // 写入换行
			bw.write("粒粒皆辛苦");
			bw.newLine();  // 写入换行
			bw.flush();    // 输入到磁盘
			System.out.println("写入成功！");
			
		} catch (IOException e) {
			e.printStackTrace();
		}finally{
			try {
				bw.close();
				w.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		

	}

}
