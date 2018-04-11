package recursive;

import java.util.Scanner;

public class Hanoi {

	public static int count=0;  // ��¼�ƶ�����
	
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.print("������Բ�̸�����");
		int num=scan.nextInt();
		hanoi(num,'A','B','C');
		scan.close();
	}
	
	/**
	 * 
	 * @param num :Բ�̸���
	 * @param start  : ��ʼ��
	 * @param help : ������
	 * @param dest : Ŀ���
	 */
	public static void hanoi(int num,char start,char help,char dest){
		if(num==1){
			count++;
			System.out.println("��"+count+"���ƶ�,��"+start+"���ƶ���"+dest+"��");
		}else{
			hanoi(num-1,start,dest,help);
			count++;
			System.out.println("��"+count+"���ƶ�,��"+start+"���ƶ���"+dest+"��");
			hanoi(num-1,help,start,dest);
		}
	}

}
