package copy;

import java.io.File;

public class Test {

	public static void main(String[] args) {
		System.out.println("main方法开始了...");
		File srcFile=new File("d:"+File.separator+"images"+File.separator+"beautiful.jpg");
		File destFile=new File("c:"+File.separator+srcFile.getName());
		new CopyThread(srcFile,destFile).start();   // 启动复制线程
		System.out.println("主方法结束...");

	}

}
