package stringbuffer;

public class StringBufferMethod {

	public static void main(String[] args) {
		StringBuffer sb=new StringBuffer();
		sb.append("�й�").append("��ˮ").append("Java");
		System.out.println("��ת֮ǰ��");
		System.out.println(sb.toString());
		sb.reverse();   // ��ת������������
		System.out.println("��ת֮��");
		System.out.println(sb.toString());
		
		StringBuffer sb2=new StringBuffer();
		sb2.append(false).append(12.5).append("hello");
		sb2.insert(1,true);   // ������Ϊ1������true
		System.out.println(sb2);

	}

}
