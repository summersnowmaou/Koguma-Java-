package common;

public class FinalizeDemo {

	public static void main(String[] args) {
		Person per=new Person();
		per=null;   // 将per引用置为null,使堆内存中的Person对象变为“垃圾”
        System.gc();  // 显式请求JVM进行垃圾回收gc
	}

}
