package homework;

public class Base {

	public static void main(String[] args) {
		int number=0;   // �洢ÿһ�������
		int sum=0;
		for (int i = 0; i < 5; i++) {
			number=number*10+2;   // ���㵱ǰ�������
			sum+=number;  // �൱�� sum=sum+number
		}
		System.out.println("����ǣ�"+sum);
	}

}
