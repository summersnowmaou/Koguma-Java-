package practice;
/*
 * �ֱ��ȡ�ַ���"   ABCmnyCW123   "�е�"CmnyCW123"���ֺ�"CW123"���֡�
      ��ʾ����ʹ�õ�indexOf(xx) lastIndexOf(xxx) substring(xxx) trim()������
 * */
public class SubPractice {

	public static void main(String[] args) {
		String str="   ABCmnyCW123   ";
		int firstCIndex=str.indexOf("C");
		System.out.println(str.substring(firstCIndex).trim());
		int lastCIndex=str.lastIndexOf("C");
		System.out.println(str.substring(lastCIndex).trim());

	}

}
