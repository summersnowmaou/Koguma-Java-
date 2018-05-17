package thread;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.text.SimpleDateFormat;
import java.util.Date;

public class ThreadDemo {

	public static void main(String[] args) {
		new Thread(){
			public void run() {
				InputStream input=null;
				OutputStream out=null;
				try {
					File srcFile=new File("d:"+File.separator+"images"+File.separator+"gg.jpg");
					File destFile=new File("c:"+File.separator+srcFile.getName());
					input=new FileInputStream(srcFile);
					out=new FileOutputStream(destFile);
					byte[] b=new byte[1024*10];
					int len=0;
					int count=0;  // ������¼�Ѿ�д����ֽ���
					long totalSize=srcFile.length();   // Ҫ���Ƶ�Դ�ļ����ܴ�С�����ֽڼ���
					while((len=input.read(b))!=-1){
						out.write(b, 0, len);
						count+=len;
						int percentage=(int)(count*1.0/totalSize*100);
						System.out.println("�Ѿ�������"+percentage+"%");
						Thread.sleep(1000);
					}
				} catch (Exception e) {
					e.printStackTrace();
				}finally{
					try {
						out.close();
						input.close();
					} catch (IOException e) {
						e.printStackTrace();
					}
				}
			}
		}.start();
		
		new Thread(){
			public void run() {
				SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS");
				for(int i=0;i<5;i++){
					System.out.println("���ڵ�ʱ���ǣ�"+sdf.format(new Date()));
				}
			}
		}.start();

	}

}
