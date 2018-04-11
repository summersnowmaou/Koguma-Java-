package common;

public class Person {
	// 在对象被JVM的gc回收之前，会先调用这个方法
    @Override
    protected void finalize() throws Throwable {
    	System.out.println("对象被回收之前做的事情...");
    }
}
