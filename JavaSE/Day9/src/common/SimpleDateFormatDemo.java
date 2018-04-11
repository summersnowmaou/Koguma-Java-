package common;

import java.text.SimpleDateFormat;
import java.util.Date;

public class SimpleDateFormatDemo {

	public static void main(String[] args) {
		Date date=new Date();
		System.out.println(date);
		SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS");   // 传递日期模版，实例化SimpleDateFormat对象
		System.out.println("现在时刻："+sdf.format(date));
	}

}
