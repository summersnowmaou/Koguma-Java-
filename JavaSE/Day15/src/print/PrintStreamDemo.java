package print;

import java.io.*;

public class PrintStreamDemo {

	public static void main(String[] args) {
		File f=new File("c:"+File.separator+"test.txt");
		PrintStream ps=null;
		try {
			ps=new PrintStream(f);   // 打印到文件中
			ps.println("\t白日依山尽");
			ps.println("\t黄河入海流");
			ps.println("\t欲穷千里目");
			ps.println("\t更上一层楼");
			System.out.println("打印完毕");
		} catch (Exception e) {
			e.printStackTrace();
		}finally{
			ps.close();
		}

	}

}
