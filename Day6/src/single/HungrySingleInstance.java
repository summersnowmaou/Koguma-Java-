package single;
/*
 * “饿汉式”单例模式:当类加载到JVM时，单例对象直接创建
 * */
public class HungrySingleInstance {
   
	// 在该类内部实例化对象
	private static HungrySingleInstance single=new HungrySingleInstance();
	
	// 私有化构造方法，防止外部实例化该类的对象
	private HungrySingleInstance(){
		
	}

	// 静态方法，获取单例对象
	public static HungrySingleInstance getSingleInstance() {
		return single;
	}
	
	
}
