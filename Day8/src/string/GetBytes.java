package string;

public class GetBytes {

	public static void main(String[] args) {
		String str="你好,java";
		byte[] b=str.getBytes();   // 将字符串转换为字节数组
		String s=new String(b);  // 将字节数组转换为字符串
		System.out.println(s);
		

	}

}
