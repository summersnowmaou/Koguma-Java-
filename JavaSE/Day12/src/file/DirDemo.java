package file;

import java.io.File;

public class DirDemo {

	public static void main(String[] args) {
		File f=new File("c:"+File.separator+"test1"+File.separator+"test2"+File.separator+"test3");
		boolean flag=f.mkdirs();   // ����Ŀ¼���������б��赫�����ڵĸ�Ŀ¼
		System.out.println(flag?"Ŀ¼�����ɹ�":"����ʧ��");
		
		System.out.println(f.getPath());
		System.out.println(f.getParentFile());

	}

}
