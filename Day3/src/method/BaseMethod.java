package method;

import java.util.Scanner;

public class BaseMethod {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.print("�����������");
		int base=scan.nextInt();    // �ȴ���������
		System.out.print("�����������");
		int count=scan.nextInt();
		int sum=baseSum(base,count);
		System.out.println("��������"+sum);
		scan.close();
	}
	
	/** ��������������ݻ����ʹ��������
	 * @param base ���մ������Ļ���
	 * @param count  ���մ������Ĵ���
	 * @return ���ؼ�����
	 */
	public static int baseSum(int base,int count){
		int number=0;
		int sum=0;
		for (int i = 0; i <count; i++) {
			number=number*10+base;   // ���㵱ǰ�������
			sum+=number;
		}
		return sum;
	}

}
