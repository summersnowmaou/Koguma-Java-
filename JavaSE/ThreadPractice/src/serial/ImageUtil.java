package serial;

import java.io.*;

public class ImageUtil {
   
	// ��װImage����
	public static Image getImage(String author,File srcFile){
		Image image=new Image();
		image.setAuthor(author);
		ByteArrayOutputStream bos=new ByteArrayOutputStream();
		InputStream input=null;
		try {
			input=new FileInputStream(srcFile);
			byte[] b=new byte[1024*10];
			int len=0;
			while((len=input.read(b))!=-1){
				bos.write(b, 0, len);   // д���ڴ�����
			}
			image.setData(bos.toByteArray());
		} catch (Exception e) {
			e.printStackTrace();
		}finally{
			try {
				input.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		return image;
	}
	
	// ���л�����
	public static boolean serialImage(Image image,File destFile){
		OutputStream out=null;
		ObjectOutputStream oos=null;
		try {
			out=new FileOutputStream(destFile);
			oos=new ObjectOutputStream(out);
			oos.writeObject(image);   // ���л�����
			return true;
		} catch (Exception e) {
			System.out.println("���л�ʧ�ܣ�ʧ��ԭ��"+e.getMessage());
		}finally{
			try {
				oos.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		return false;
	}
	
	// �����л�
	public static Image deserialImage(File srcFile){
		InputStream input=null;
		ObjectInputStream ois=null;
		Image image=null;
		try {
			input=new FileInputStream(srcFile);
			ois=new ObjectInputStream(input);
			image=(Image)ois.readObject();
		} catch (Exception e) {
			System.out.println("�����л�ʧ�ܣ�ʧ��ԭ��"+e.getMessage());
		}finally{
			try {
				ois.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		return image;
	}
	
}
