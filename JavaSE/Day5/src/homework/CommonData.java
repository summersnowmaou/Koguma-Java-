package homework;

public class CommonData {

	public static void main(String[] args) {
		int[] a={23,12,45,11,12,12};
		int[] b={99,33,12,45,67,11,12,12,23};
        int[] temp=findCommon(a,b);   
        int[] result=dropRepeat(temp);
        System.out.println("���յĹ�ͬԪ���ǣ�");
        for(int x:result){
        	System.out.print(x+"  ");
        }
	}
	
	// �ҳ���������Ĺ�ͬԪ�أ������ĳ�������У�������
	public static int[] findCommon(int[] a,int[] b){
		int[] temp=new int[a.length];    // ������ʱ�洢��ͬԪ��
		int k=0;
		for(int i=0;i<a.length;i++){
			for(int j=0;j<b.length;j++){
				if(a[i]==b[j]){
					temp[k++]=a[i];   // ����ͬԪ�ظ�ֵ��temp
					break;
				}
			}
		}
		int[] result=new int[k];
		System.arraycopy(temp,0,result,0,k);   // ��������
		return result;
	}
	
	public static int[] dropRepeat(int[] array){
		int[] temp=new int[array.length];   // ��ŵ��ǲ��ظ���Ԫ��
		int k=0;
		for(int i=0;i<array.length;i++){   // ѡȡĳ������������Ԫ�ؽ��бȽ�
			boolean flag=true;
			for(int j=i+1;j<array.length;j++){   // ��һ�Ƚ�
				if(array[i]==array[j]){
					flag=false;
					break;
				}
			}
			if(flag){
				temp[k++]=array[i];
			}
		}
		int[] result=new int[k];
		System.arraycopy(temp, 0, result, 0, k);
		return result;
	}

}
