package method;

public class ChangeNumber {

	public static void main(String[] args) {
        int a=1;
        System.out.println("调用changeNumber(int a)方法之前，a="+a);
        changeNumber(a);
        System.out.println("调用changeNumber(int a)方法之后，a="+a);
	}
	
	
	public static void changeNumber(int a){
		if(a==3){
			System.out.println("直接结束该方法");
			return;   // 直接结束方法
		}
		System.out.println("进入changeNumber(int a)方法了...a="+a);
		a+=5;
		System.out.println("在changeNumber(int a)方法改变值后，a="+a);
	}

}
