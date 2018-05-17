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
					int count=0;  // 用来记录已经写入的字节数
					long totalSize=srcFile.length();   // 要复制的源文件的总大小，以字节计算
					while((len=input.read(b))!=-1){
						out.write(b, 0, len);
						count+=len;
						int percentage=(int)(count*1.0/totalSize*100);
						System.out.println("已经下载了"+percentage+"%");
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
					System.out.println("现在的时间是："+sdf.format(new Date()));
				}
			}
		}.start();

	}

}
