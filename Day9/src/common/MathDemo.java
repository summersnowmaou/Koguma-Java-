package common;

public class MathDemo {

	public static void main(String[] args) {
		double powResult=Math.pow(2,3);
		System.out.println("2��3�η�Ϊ��"+powResult);
		System.out.println("8��ƽ������"+Math.sqrt(8));
		System.out.println("-7.35�ľ���ֵ�ǣ�"+Math.abs(-7.35));
		System.out.println("8.1����ȡ����"+Math.ceil(8.1));
		System.out.println("9.9����ȡ����"+Math.floor(9.9));
		System.out.println("8.499��������Ľ����"+Math.round(8.499));
		System.out.println("8.5��������Ľ����"+Math.round(8.5));
		System.out.println("�������һ����0.0(����)��1.0(������)ֵ��"+Math.random());
		int ran=(int)(Math.random()*16)+3;
		System.out.println("�������3��18�����֣�"+ran);
		System.out.println("Բ�����ǣ�"+Math.PI);

	}

}
