package copy;

public class ArrayCopy {

	public static void main(String[] args) {
        int[] a={1,2,3,4,5,6,7,8,9};
        int[] b={11,22,33,44,55,66,77,88,99};
        System.arraycopy(a,1,b,4,3);
        System.out.println("复制后的数组：");
        for (int i = 0; i < b.length; i++) {
			System.out.print(b[i]+"  ");
		}
	}

}
