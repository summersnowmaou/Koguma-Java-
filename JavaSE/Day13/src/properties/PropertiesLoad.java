package properties;

import java.io.*;
import java.util.Properties;

public class PropertiesLoad {

	public static void main(String[] args) {
		Properties pro=new Properties();
		InputStream input=null;
		try {
			input=new FileInputStream("c:"+File.separator+"myinfo.properties");
			pro.load(input);   // 从字节流中读取数据加载到Properties中
			System.out.println("是否为VIP："+pro.getProperty("isVIP"));
			System.out.println("上次更新时间："+pro.getProperty("updatetime"));
			System.out.println("应用模式："+pro.getProperty("mode"));
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
