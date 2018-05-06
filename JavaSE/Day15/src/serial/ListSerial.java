package serial;

import java.io.*;
import java.util.*;

public class ListSerial {

	public static void main(String[] args) {
		File f=new File("c:"+File.separator+"person.txt");
		List<Person> list=new ArrayList<Person>();
		Collections.addAll(list,new Person("张三",20,"男"),new Person("李四",25,"男"),new Person("王娟",26,"女"));
		OutputStream out=null;
		ObjectOutputStream oos=null;
		try {
			out=new FileOutputStream(f);
			oos=new ObjectOutputStream(out);  
			oos.writeObject(list);   // 序列化
			System.out.println("序列化成功！");
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
