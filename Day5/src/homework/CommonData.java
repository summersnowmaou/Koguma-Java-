package homework;

public class CommonData {

	public static void main(String[] args) {
		int[] a={23,12,45,11,12,12};
		int[] b={99,33,12,45,67,11,12,12,23};
        int[] temp=findCommon(a,b);   
        int[] result=dropRepeat(temp);
        System.out.println("最终的共同元素是：");
        for(int x:result){
        	System.out.print(x+"  ");
        }
	}
	
	// 找出两个数组的共同元素，存放于某个数组中，并返回
	public static int[] findCommon(int[] a,int[] b){
		int[] temp=new int[a.length];    // 用来暂时存储相同元素
		int k=0;
		for(int i=0;i<a.length;i++){
			for(int j=0;j<b.length;j++){
				if(a[i]==b[j]){
					temp[k++]=a[i];   // 将相同元素赋值给temp
					break;
				}
			}
		}
		int[] result=new int[k];
		System.arraycopy(temp,0,result,0,k);   // 复制数组
		return result;
	}
	
	public static int[] dropRepeat(int[] array){
		int[] temp=new int[array.length];   // 存放的是不重复的元素
		int k=0;
		for(int i=0;i<array.length;i++){   // 选取某个数据与其后的元素进行比较
			boolean flag=true;
			for(int j=i+1;j<array.length;j++){   // 逐一比较
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
