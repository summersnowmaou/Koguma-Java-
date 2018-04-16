package file;

import java.io.File;

public class ListFilesDemo {

	public static void main(String[] args) {
		File f=new File("d:"+File.separator);
		File[] files=f.listFiles();
		System.out.println(files.length);
		for(File file:files){
			System.out.println(file);
		}

	}

}
