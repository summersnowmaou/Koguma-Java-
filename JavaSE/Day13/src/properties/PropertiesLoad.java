package properties;

import java.io.*;
import java.util.Properties;

public class PropertiesLoad {

	public static void main(String[] args) {
		Properties pro=new Properties();
		InputStream input=null;
		try {
			input=new FileInputStream("c:"+File.separator+"myinfo.properties");
			pro.load(input);   // ���ֽ����ж�ȡ���ݼ��ص�Properties��
			System.out.println("�Ƿ�ΪVIP��"+pro.getProperty("isVIP"));
			System.out.println("�ϴθ���ʱ�䣺"+pro.getProperty("updatetime"));
			System.out.println("Ӧ��ģʽ��"+pro.getProperty("mode"));
		} catch (Exception e) {
			e.printStackTrace();
		}finally{
			try {
				input.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

	}

}
