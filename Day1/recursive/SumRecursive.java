package recursive;

public class SumRecursive {

	public static void main(String[] args) {
        int result=getSum(100);
        System.out.println(result);
	}
	
	/**
	 * �˷����������ǻ�ȡ��1��number�ĺ�
	 * @param number 
	 * @return
	 */
	
	
	/*
	 * eg:number=10
	 * getSum(9);
	 * getSum(8);
	 * ....
	 * getSum(2);
	 * getSum(1)�����1;
	 * */
	public static int getSum(int number){
		if(number==1){
			return 1;
		}else{
			int temp=getSum(number-1);   // ��1��ʼ��number-1�ĺ�
			return temp+number;
		}
	}

}
