package file;

import java.io.File;
import java.io.IOException;

public class FileDemo {

	public static void main(String[] args) {
		File f=new File("c:"+File.separator+"test.txt");
		if(f.exists()){   // 判断文件或目录是否存在
			f.delete();   // 删除文件
			System.out.println("文件已删除");
		}else{
			try {
				f.createNewFile();   // 创建新文件
				System.out.println("创建成功！");
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

	}

}
