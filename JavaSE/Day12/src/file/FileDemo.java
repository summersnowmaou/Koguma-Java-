package file;

import java.io.File;
import java.io.IOException;

public class FileDemo {

	public static void main(String[] args) {
		File f=new File("c:"+File.separator+"test.txt");
		if(f.exists()){   // �ж��ļ���Ŀ¼�Ƿ����
			f.delete();   // ɾ���ļ�
			System.out.println("�ļ���ɾ��");
		}else{
			try {
				f.createNewFile();   // �������ļ�
				System.out.println("�����ɹ���");
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

	}

}
