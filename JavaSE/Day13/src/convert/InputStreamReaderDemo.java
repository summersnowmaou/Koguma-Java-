package convert;
import java.io.*;
public class InputStreamReaderDemo {

	public static void main(String[] args) {
		InputStreamReader isr=new InputStreamReader(System.in);   // 包装的是读取键盘输入的输入流
		BufferedReader br=new BufferedReader(isr);   // 将InputStreamReader包装到BufferedReader
		System.out.print("请输入：");
		try {
			String content=br.readLine();   // 读取键盘输入，输入完成之前一直阻塞
			System.out.println("您输入的内容是："+content);
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
