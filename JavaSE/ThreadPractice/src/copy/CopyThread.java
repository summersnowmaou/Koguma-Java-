package copy;

import java.io.*;

public class CopyThread extends Thread{

	private File srcFile;
	private File destFile;
	public CopyThread(){
	}

	public CopyThread(File srcFile, File destFile) {
		this.srcFile = srcFile;
		this.destFile = destFile;
	}
	
	@Override
	public void run() {
		InputStream input=null;
		OutputStream out=null;
		try {
			input=new FileInputStream(srcFile);
			out=new FileOutputStream(destFile);
			byte[] b=new byte[1024];
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
}
