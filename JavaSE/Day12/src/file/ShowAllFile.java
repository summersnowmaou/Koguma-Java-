package file;

import java.io.File;

public class ShowAllFile {

	public static void main(String[] args) {
		File f=new File("d:"+File.separator);
		showAllFiles(f);

	}
	
	public static void showAllFiles(File f){
		if(f!=null){
			if(f.isDirectory()){   // �Ƿ�ΪĿ¼
				File[] files=f.listFiles();   // ���ص�ǰ���ڱ�����Ŀ¼�е��ļ���Ŀ¼��Fileʵ������
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
