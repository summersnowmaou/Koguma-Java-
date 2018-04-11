package sort;

public class QuickSort {

	public static void main(String[] args) {
		int[] a={22,55,11,66,88,77,44,99,33};
		quickSort(a,0,a.length-1);
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i]+"  ");
		}
	}
	
	
	public static void quickSort(int[] array,int start,int end){
		if(start>=end){
			return;   // ��������
		}
		int data=array[start];   // ����ʼ����ִ�е�ֵ��Ϊ���ֽ�ֵ��
		int i=start+1;  // ��¼�����ƶ���λ�ã����������
		int j=end;   // ��¼�����ƶ���λ��("����")
		while(true){
			while(i<=end && array[i]<data){
				i++;   // ��������
			}
			while(j>=start+1 && array[j]>data){
				j--;   // ��������
			}
			if(j>i){
				int temp=array[i];
				array[i]=array[j];
				array[j]=temp;
			}else{
				break;
			}
		}
		// ���������롰�ֽ�ֵ������λ��
		array[start]=array[j];
		array[j]=data;   
		quickSort(array,start,j-1);   // �ݹ������ɡ��ֽ�ֵ����ߵ�����
		quickSort(array,j+1,end);   // �ݹ������ɡ��ֽ�ֵ���ұߵ�����
	}

}
