package array;

public class ChangeableParam {

	public static void main(String[] args) {
		show();
        show(1,3,5,7,9);
        show(2,4,6,8,0,12);
	}
	
	
	public static void show(int... a){
		System.out.println("当前传递的参数个数是："+a.length);
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i]+"  ");
		}
		System.out.println();
		System.out.println("***************************");
	}

}
