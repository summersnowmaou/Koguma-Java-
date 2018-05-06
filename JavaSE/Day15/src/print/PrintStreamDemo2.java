package print;

import java.io.*;

public class PrintStreamDemo2 {

	public static void main(String[] args) {
		File f=new File("c:"+File.separator+"test.txt");
		OutputStream out=null;
		PrintStream ps=null;
		try {
			out=new FileOutputStream(f);
			BufferedOutputStream bs=new BufferedOutputStream(out);
			
			ps=new PrintStream(bs);   // 将BufferedOutputStream包装到PrintStream中
			ps.println("降龙十八掌");
			ps.println("六脉神剑");
			ps.println("孙子兵法");
			ps.flush();
			System.out.println("打印完毕");
		} catch (Exception e) {
			e.printStackTrace();
		}finally{
			ps.close();
		}

	}

}
