package string;

public class GetBytes {

	public static void main(String[] args) {
		String str="���,java";
		byte[] b=str.getBytes();   // ���ַ���ת��Ϊ�ֽ�����
		String s=new String(b);  // ���ֽ�����ת��Ϊ�ַ���
		System.out.println(s);
		

	}

}
