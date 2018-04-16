package file;

import java.io.File;

public class ShowAllFile {

	public static void main(String[] args) {
		File f=new File("d:"+File.separator);
		showAllFiles(f);

	}
	
	public static void showAllFiles(File f){
		if(f!=null){
			if(f.isDirectory()){   // 是否为目录
				File[] files=f.listFiles();   // 返回当前正在遍历的目录中的文件和目录的File实例数组
                if(files!=null){
                	for(File file:files){
                		showAllFiles(file);
                	}
                }
			}else{
				System.out.println(f.getPath());
			}
		}
	}
	

}
