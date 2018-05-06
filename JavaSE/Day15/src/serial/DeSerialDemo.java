package serial;

import java.io.*;

public class DeSerialDemo {

	public static void main(String[] args) {
		File f=new File("c:"+File.separator+"person.txt");
		InputStream input=null;
		ObjectInputStream ois=null;
		try {
			input=new FileInputStream(f);
			ois=new ObjectInputStream(input);
			Person per=(Person)ois.readObject();    // �����л�
			System.out.println(per);
		} catch (Exception e) {
			e.printStackTrace();
		}finally{
			try {
				ois.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

	}

}
