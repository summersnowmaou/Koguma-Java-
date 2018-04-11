package common;

import java.util.Calendar;

public class CalendarDemo {

	public static void main(String[] args) {
		Calendar cal=Calendar.getInstance();
		System.out.println("第几个月："+(cal.get(Calendar.MONTH)+1));
        System.out.println("当前月的第几天："+cal.get(Calendar.DAY_OF_MONTH));
        System.out.println("星期几："+cal.get(Calendar.DAY_OF_WEEK));
        System.out.println("今年的第几天："+cal.get(Calendar.DAY_OF_YEAR));
        System.out.println("*******************************");
        cal.set(1937, 6, 7);   // 调整日历
        System.out.println("第几个月："+(cal.get(Calendar.MONTH)+1));
        System.out.println("当前月的第几天："+cal.get(Calendar.DAY_OF_MONTH));
        System.out.println("星期几："+cal.get(Calendar.DAY_OF_WEEK));
        System.out.println("今年的第几天："+cal.get(Calendar.DAY_OF_YEAR));
	}

}
