package day2homework;

public class FindNum {

	public static void main(String[] args) {
		int[] a = {23,12,45,11};
		int[] b = {99,33,12,45,67,11};
		String str=findNum1(a,b);
		if(str==" ") {
			System.out.println("��������û�й�ͬԪ�أ�");
		}else {
			System.out.print("��������Ĺ�ͬԪ��Ϊ��"+str);
		}
		
		
	}
	/**  ����һ��
	public static void findNum(int[] a,int[] b) {
		
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<b.length;j++) {
				if(a[i]==b[j]) {
					System.out.print(a[i]);
				}
					
			}
		}
	}
	*/
	//��������
	public static String findNum1(int[] a,int[] b) {
	
		String str=" ";
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<b.length;j++) {
				if(a[i]==b[j]) {
					str+=a[i]+" ";
				}
			}
		}
	return str;
	}
}