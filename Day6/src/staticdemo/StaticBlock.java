package staticdemo;

public class StaticBlock {
	
    static String note;
    static int count;
    
    public StaticBlock(){
    	System.out.println("无参构造...");
    }
	
	static{
		System.out.println("这是静态代码块中的内容...");
		note="备注";
		count=2;
		System.out.println("初始化后的note的值为："+note);
		System.out.println("初始化后的count的值为："+count);
	}

//	public static void main(String[] args) {
//		System.out.println("这是main方法");
//
//	}

}
