package memory;

import java.io.ByteArrayInputStream;
import java.io.IOException;

public class ByteArrayInputStreamDemo {

	public static void main(String[] args) {
        String data="��ã��ڴ���";
        ByteArrayInputStream bis=new ByteArrayInputStream(data.getBytes());   // ���췽���д�����ֽ��������Ҫ��ȡ���ֽ�����
        byte[] b=new byte[1024];  // �Զ��建����
        try {
			int len=bis.read(b);
			System.out.println("��ȡ�������ǣ�"+new String(b,0,len));
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
