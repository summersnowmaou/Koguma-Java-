package serial;

import java.io.*;

public class SerialDemo {

	public static void main(String[] args) {
		File f=new File("c:"+File.separator+"person.txt");
		Person per=new Person("����",80,"��");
		OutputStream out=null;
		ObjectOutputStream oos=null;
		try {
			out=new FileOutputStream(f);
			oos=new ObjectOutputStream(out);  
			Person.job="�ʵ�";
			oos.writeObject(per);   // ���л�
			System.out.println("���л��ɹ���");
		} catch (Exception e) {
			e.printStackTrace();
		}finally{
			try {
				oos.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

	}

}
