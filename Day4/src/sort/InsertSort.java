package sort;

public class InsertSort {

	public static void main(String[] args) {
		int[] a={22,55,11,66,88,77,44,99,33};
        insertSort(a);
        System.out.println("��������Ľ����");
        for (int i = 0; i < a.length; i++) {
			System.out.print(a[i]+"  ");
		}
	}
	
	
	public static void insertSort(int[] a){
		for (int i = 1; i <=a.length-1; i++) {
			int data=a[i];  // ��ǰ��ָʾ�����ݡ�
			int j=i-1;   // ʹ��j������¼��ָʾ�����ݡ���ǰһ�����ݵ�����
			while(j>=0 && data<a[j]){
				a[j+1]=a[j];   // ���ơ�ָʾ�ơ�����ǰ�������
				j--;
			}
			a[j+1]=data;
		}
	}

}
