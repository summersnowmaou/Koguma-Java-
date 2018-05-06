package print;

import java.io.*;

public class PrintWriterDemo {

	public static void main(String[] args) {
		File f=new File("c:"+File.separator+"test.txt");
		PrintWriter pw=null;
		try {
			pw=new PrintWriter(f);
			pw.println("����ʮ����");
			pw.flush();
			
			
			pw=new PrintWriter(new FileWriter(f,true));
			pw.println("������");
			pw.flush();
			
			pw=new PrintWriter(new FileOutputStream(f,true));
			pw.println(false);
			pw.println('W');
			pw.flush();
			System.out.println("��ӡ���");
		} catch (Exception e) {
			e.printStackTrace();
		}finally{
			pw.close();
		}

	}

}
