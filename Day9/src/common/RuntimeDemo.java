package common;

import java.io.IOException;
import java.util.Scanner;

public class RuntimeDemo {

	public static void main(String[] args) {
		Runtime rt= Runtime.getRuntime();
		rt.gc();    // 显式请求JVM进行垃圾回收gc
        System.out.println("当前JVM的内存总量是："+rt.totalMemory()+"字节");
        System.out.println("JVM试图使用的最大内存量："+rt.maxMemory());   
        System.out.println("当前JVM的空闲内存量："+rt.freeMemory());
        try {
			rt.exec("notepad");
			rt.exec("calc");
			Process qq=rt.exec("F:\\Program Files (x86)\\Tencent\\QQ\\Bin\\QQ.exe");   // 打开QQ进程
			Scanner scan=new Scanner(System.in);
			System.out.print("要关闭QQ吗？y/n");
			String choice=scan.next();
			if("y".equals(choice)){
				qq.destroy();   // 销毁进程
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
