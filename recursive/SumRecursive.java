package recursive;

public class SumRecursive {

	public static void main(String[] args) {
        int result=getSum(100);
        System.out.println(result);
	}
	
	/**
	 * 此方法的作用是获取从1到number的和
	 * @param number 
	 * @return
	 */
	
	
	/*
	 * eg:number=10
	 * getSum(9);
	 * getSum(8);
	 * ....
	 * getSum(2);
	 * getSum(1)结果是1;
	 * */
	public static int getSum(int number){
		if(number==1){
			return 1;
		}else{
			int temp=getSum(number-1);   // 从1开始到number-1的和
			return temp+number;
		}
	}

}
