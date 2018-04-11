package stringbuffer;

public class StringDemo {

	public static void main(String[] args) {
		String str="hello";
		// 会产生大量的“垃圾”，而且不断“断开-连接”消耗性能
		long start=System.currentTimeMillis();
        for(int i=0;i<10000;i++){
        	str+=i;   // str=str+i
        }
        long end=System.currentTimeMillis();
        System.out.println("使用String耗时："+(end-start));
        System.out.println(str.length());
	}

}
