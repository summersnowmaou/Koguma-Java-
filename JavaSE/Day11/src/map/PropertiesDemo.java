package map;

import java.util.Properties;

public class PropertiesDemo {

	public static void main(String[] args) {
		Properties pro=new Properties();
		pro.setProperty("oper","linux");
		pro.setProperty("time","2018");
		pro.setProperty("vip","yes");
		System.out.println(pro.getProperty("vip"));
		System.out.println(pro.getProperty("abc","û���ҵ���Ӧ��������������Ĭ��ֵ"));

	}

}
