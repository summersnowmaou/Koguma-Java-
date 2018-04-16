package file;

import java.io.File;

public class DirDemo {

	public static void main(String[] args) {
		File f=new File("c:"+File.separator+"test1"+File.separator+"test2"+File.separator+"test3");
		boolean flag=f.mkdirs();   // 创建目录，包括所有必需但不存在的父目录
		System.out.println(flag?"目录创建成功":"创建失败");
		
		System.out.println(f.getPath());
		System.out.println(f.getParentFile());

	}

}
