package printstream;

import java.io.*;

public class PrintfDemo {

	public static void main(String[] args) {
		File f=new File("c:"+File.separator+"test.txt");
		OutputStream out=null;
		PrintStream ps=null;
		try {
			out=new FileOutputStream(f);
			ps=new PrintStream(out);
			ps.printf("姓名:%s，年龄%d，性别：%c","张三",20,'男');   // 格式化打印
			System.out.println("打印成功！");
		} catch (Exception e) {
			e.printStackTrace();
		}finally{
			ps.close();
		}
				

	}

}
