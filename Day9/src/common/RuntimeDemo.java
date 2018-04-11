package common;

import java.io.IOException;
import java.util.Scanner;

public class RuntimeDemo {

	public static void main(String[] args) {
		Runtime rt= Runtime.getRuntime();
		rt.gc();    // ��ʽ����JVM������������gc
        System.out.println("��ǰJVM���ڴ������ǣ�"+rt.totalMemory()+"�ֽ�");
        System.out.println("JVM��ͼʹ�õ�����ڴ�����"+rt.maxMemory());   
        System.out.println("��ǰJVM�Ŀ����ڴ�����"+rt.freeMemory());
        try {
			rt.exec("notepad");
			rt.exec("calc");
			Process qq=rt.exec("F:\\Program Files (x86)\\Tencent\\QQ\\Bin\\QQ.exe");   // ��QQ����
			Scanner scan=new Scanner(System.in);
			System.out.print("Ҫ�ر�QQ��y/n");
			String choice=scan.next();
			if("y".equals(choice)){
				qq.destroy();   // ���ٽ���
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
