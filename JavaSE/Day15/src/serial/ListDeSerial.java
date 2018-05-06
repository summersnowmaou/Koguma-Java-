package serial;
import java.util.*;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;

public class ListDeSerial {

	public static void main(String[] args) {
		File f=new File("c:"+File.separator+"person.txt");
		InputStream input=null;
		ObjectInputStream ois=null;
		try {
			input=new FileInputStream(f);
			ois=new ObjectInputStream(input);
			List<Person> list=(List<Person>)ois.readObject();    // ∑¥–Ú¡–ªØ
			for(Person per:list){
				System.out.println(per);
			}
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
