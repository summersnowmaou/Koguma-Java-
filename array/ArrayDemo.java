package array;

public class ArrayDemo {

	public static void main(String[] args) {
		int[] a=new int[5];
		a[2]=23;
		a[4]=19;
		System.out.println("������һ�����飺");
		for(int i=0;i<a.length;i++){   // i�䵱���±�
			System.out.print(a[i]+"  ");
		}
		System.out.println();
		
		
		int[] b={11,22,33,44,55,66};   // ֱ�Ӹ����鸳ֵ
		System.out.println("�����ڶ������飺");
		for(int i=0;i<b.length;i++){   // i�䵱���±�
			System.out.print(b[i]+"  ");
		}
		System.out.println();
		System.out.println("ʹ��foreach��ʽ�������飺");
		for(int x:b){
			System.out.print(x+"  ");
		}
		System.out.println();
	}

}
