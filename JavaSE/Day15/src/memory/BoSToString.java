package memory;

import java.io.ByteArrayOutputStream;
import java.io.IOException;

public class BoSToString {

	public static void main(String[] args) {
		ByteArrayOutputStream bos=new ByteArrayOutputStream();
		try {
			bos.write("hello world�й�".getBytes());
			System.out.println("�Ѿ�д�뵽�ڴ��е��ַ����ǣ�"+bos.toString());
    	} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
