package convert;
import java.io.*;
public class InputStreamReaderDemo {

	public static void main(String[] args) {
		InputStreamReader isr=new InputStreamReader(System.in);   // ��װ���Ƕ�ȡ���������������
		BufferedReader br=new BufferedReader(isr);   // ��InputStreamReader��װ��BufferedReader
		System.out.print("�����룺");
		try {
			String content=br.readLine();   // ��ȡ�������룬�������֮ǰһֱ����
			System.out.println("������������ǣ�"+content);
		} catch (IOException e) {
			e.printStackTrace();
		}finally{
			try {
				br.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

}
