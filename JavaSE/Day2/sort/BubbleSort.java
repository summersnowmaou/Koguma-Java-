package sort;

public class BubbleSort {

	public static void main(String[] args) {
		int[] a={22,55,11,66,88,77,44,99,33};
        bubbleSort(a);
	}
	
	public static void bubbleSort(int[] a){
		for (int i = 1; i <=a.length-1; i++) {   // ���ѭ�����ƱȽϵġ�������
		//	System.out.println("��ʼ��"+i+"������");
			boolean flag=true;
			
			for(int j=0;j<a.length-i;j++){   // j���������������(�±�)��jҲ�����ŵ�ǰ�˵ġ������Ƚϡ��Ĵ���
				if(a[j]>a[j+1]){
					int temp=a[j];
					a[j]=a[j+1];
					a[j+1]=temp;
					flag=false;
				}
			}
		//	System.out.println("��"+i+"�˽���");
			if(flag){   // �����ǰ���ˡ��Ѿ��ź����򲻱ؽ�����һ�˵�����ֱ���������ѭ��
				break;
			}
		/**	
			System.out.println("��"+i+"����������");
			for(int x:a){
				System.out.print(x+"  ");
			}
			
			System.out.println();
			**/
		}
	}

}
