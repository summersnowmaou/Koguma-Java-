package array;

public class MethodArray {

	public static void main(String[] args) {
		int[] a={23,12,999,88,78};
        changeArray(a);
        for (int i = 0; i < a.length; i++) {
			System.out.print(a[i]+"  ");
		}
	}
	
	public static void changeArray(int[] a){
		a[2]=666;
	}

}
