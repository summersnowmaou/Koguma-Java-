package serial;

import java.io.*;

public class SerialDemo {

	public static void main(String[] args) {
		File f=new File("c:"+File.separator+"person.txt");
		Person per=new Person("胡夫",80,"男");
		OutputStream out=null;
		ObjectOutputStream oos=null;
		try {
			out=new FileOutputStream(f);
			oos=new ObjectOutputStream(out);  
			Person.job="皇帝";
			oos.writeObject(per);   // 序列化
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
