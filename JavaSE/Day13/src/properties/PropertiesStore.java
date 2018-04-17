package properties;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Properties;

public class PropertiesStore {

	public static void main(String[] args) {
		Properties pro=new Properties();
		pro.setProperty("mode","OPEN");
		pro.setProperty("isVIP","no");
		pro.setProperty("updatetime","20180101");
        OutputStream out=null;
        try {
			out=new FileOutputStream("c:"+File.separator+"myinfo.properties");
			pro.store(out,"this is my default information");    // д�������ļ���
			System.out.println("�����ļ�д��ɹ���");
		} catch (Exception e) {
			e.printStackTrace();
		}finally{
			try {
				out.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

}
