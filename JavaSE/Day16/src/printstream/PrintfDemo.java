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
			ps.printf("����:%s������%d���Ա�%c","����",20,'��');   // ��ʽ����ӡ
			System.out.println("��ӡ�ɹ���");
		} catch (Exception e) {
			e.printStackTrace();
		}finally{
			ps.close();
		}
				

	}

}
