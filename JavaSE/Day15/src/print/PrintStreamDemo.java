package print;

import java.io.*;

public class PrintStreamDemo {

	public static void main(String[] args) {
		File f=new File("c:"+File.separator+"test.txt");
		PrintStream ps=null;
		try {
			ps=new PrintStream(f);   // ��ӡ���ļ���
			ps.println("\t������ɽ��");
			ps.println("\t�ƺ��뺣��");
			ps.println("\t����ǧ��Ŀ");
			ps.println("\t����һ��¥");
			System.out.println("��ӡ���");
		} catch (Exception e) {
			e.printStackTrace();
		}finally{
			ps.close();
		}

	}

}
