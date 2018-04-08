package stringbuffer;

public class StringBufferDemo {

	public static void main(String[] args) {
		StringBuffer sb=new StringBuffer();
		sb.append("hello");
		long start=System.currentTimeMillis();
		for(int i=0;i<10000;i++){
			sb.append(i);
		}
		long end=System.currentTimeMillis();
        System.out.println("Ê¹ÓÃStringBufferºÄÊ±£º"+(end-start));
        System.out.println(sb.length());
        
     //   sb.append("abc").append(false).append(12.5);
	}

}
