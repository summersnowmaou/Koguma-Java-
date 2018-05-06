package serial;

import java.io.*;
import java.util.*;

public class ListSerial {

	public static void main(String[] args) {
		File f=new File("c:"+File.separator+"person.txt");
		List<Person> list=new ArrayList<Person>();
		Collections.addAll(list,new Person("����",20,"��"),new Person("����",25,"��"),new Person("����",26,"Ů"));
		OutputStream out=null;
		ObjectOutputStream oos=null;
		try {
			out=new FileOutputStream(f);
			oos=new ObjectOutputStream(out);  
			oos.writeObject(list);   // ���л�
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
