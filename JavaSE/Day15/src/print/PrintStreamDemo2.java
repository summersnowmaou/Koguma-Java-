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
			
			ps=new PrintStream(bs);   // ��BufferedOutputStream��װ��PrintStream��
			ps.println("����ʮ����");
			ps.println("������");
			ps.println("���ӱ���");
			ps.flush();
			System.out.println("��ӡ���");
		} catch (Exception e) {
			e.printStackTrace();
		}finally{
			ps.close();
		}

	}

}
