package method;

public class ChangeNumber {

	public static void main(String[] args) {
        int a=1;
        System.out.println("����changeNumber(int a)����֮ǰ��a="+a);
        changeNumber(a);
        System.out.println("����changeNumber(int a)����֮��a="+a);
	}
	
	
	public static void changeNumber(int a){
		if(a==3){
			System.out.println("ֱ�ӽ����÷���");
			return;   // ֱ�ӽ�������
		}
		System.out.println("����changeNumber(int a)������...a="+a);
		a+=5;
		System.out.println("��changeNumber(int a)�����ı�ֵ��a="+a);
	}

}
