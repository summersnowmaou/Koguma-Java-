package serial;

import java.io.*;

public class ImageUtil {
   
	// 组装Image对象
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
				bos.write(b, 0, len);   // 写到内存流中
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
	
	// 序列化对象
	public static boolean serialImage(Image image,File destFile){
		OutputStream out=null;
		ObjectOutputStream oos=null;
		try {
			out=new FileOutputStream(destFile);
			oos=new ObjectOutputStream(out);
			oos.writeObject(image);   // 序列化对象
			return true;
		} catch (Exception e) {
			System.out.println("序列化失败，失败原因："+e.getMessage());
		}finally{
			try {
				oos.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		return false;
	}
	
	// 反序列化
	public static Image deserialImage(File srcFile){
		InputStream input=null;
		ObjectInputStream ois=null;
		Image image=null;
		try {
			input=new FileInputStream(srcFile);
			ois=new ObjectInputStream(input);
			image=(Image)ois.readObject();
		} catch (Exception e) {
			System.out.println("反序列化失败，失败原因："+e.getMessage());
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
