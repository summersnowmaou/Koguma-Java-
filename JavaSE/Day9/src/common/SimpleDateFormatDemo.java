package common;

import java.text.SimpleDateFormat;
import java.util.Date;

public class SimpleDateFormatDemo {

	public static void main(String[] args) {
		Date date=new Date();
		System.out.println(date);
		SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS");   // ��������ģ�棬ʵ����SimpleDateFormat����
		System.out.println("����ʱ�̣�"+sdf.format(date));
	}

}
