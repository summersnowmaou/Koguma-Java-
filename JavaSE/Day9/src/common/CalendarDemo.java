package common;

import java.util.Calendar;

public class CalendarDemo {

	public static void main(String[] args) {
		Calendar cal=Calendar.getInstance();
		System.out.println("�ڼ����£�"+(cal.get(Calendar.MONTH)+1));
        System.out.println("��ǰ�µĵڼ��죺"+cal.get(Calendar.DAY_OF_MONTH));
        System.out.println("���ڼ���"+cal.get(Calendar.DAY_OF_WEEK));
        System.out.println("����ĵڼ��죺"+cal.get(Calendar.DAY_OF_YEAR));
        System.out.println("*******************************");
        cal.set(1937, 6, 7);   // ��������
        System.out.println("�ڼ����£�"+(cal.get(Calendar.MONTH)+1));
        System.out.println("��ǰ�µĵڼ��죺"+cal.get(Calendar.DAY_OF_MONTH));
        System.out.println("���ڼ���"+cal.get(Calendar.DAY_OF_WEEK));
        System.out.println("����ĵڼ��죺"+cal.get(Calendar.DAY_OF_YEAR));
	}

}
