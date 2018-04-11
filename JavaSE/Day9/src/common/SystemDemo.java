package common;

public class SystemDemo {

	public static void main(String[] args) {
		System.out.println("正常输出信息...");
		System.err.println("输出标准错误信息...");
		int[] a = {1,2,3,4};
		int[] b = new int[5];
		System.arraycopy(a,1,b,3,2);   // 数组拷贝
		
        for(int x:b){
        	System.out.print(x+"  ");
        }
        System.exit(0);   // 退出程序

	}

}
