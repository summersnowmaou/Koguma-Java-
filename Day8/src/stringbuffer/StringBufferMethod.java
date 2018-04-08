package stringbuffer;

public class StringBufferMethod {

	public static void main(String[] args) {
		StringBuffer sb=new StringBuffer();
		sb.append("中国").append("香水").append("Java");
		System.out.println("反转之前：");
		System.out.println(sb.toString());
		sb.reverse();   // 反转缓冲区的内容
		System.out.println("反转之后：");
		System.out.println(sb.toString());
		
		StringBuffer sb2=new StringBuffer();
		sb2.append(false).append(12.5).append("hello");
		sb2.insert(1,true);   // 在索引为1处插入true
		System.out.println(sb2);

	}

}
