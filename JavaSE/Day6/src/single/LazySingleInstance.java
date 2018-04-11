package single;
/*
 * “懒汉式”单例模式:当类加载到JVM时，并不直接创建单例对象，用户请求单例对象时(用户需要使用时)，才实例化该单例对象
 * */
public class LazySingleInstance {
   
	// 在该类内部实例化对象
	private static LazySingleInstance single;
	
	// 私有化构造方法，防止外部实例化该类的对象
	private LazySingleInstance(){
		
	}

	// 静态方法，获取单例对象
	public static synchronized LazySingleInstance getSingleInstance() {
		if(single==null){
			System.out.println("第一次访问单例，创建......");
			single=new LazySingleInstance();
		}
		return single;
	}
	
}
