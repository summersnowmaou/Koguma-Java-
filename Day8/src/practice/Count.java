package practice;
/**
 * 
 * ��д����ͳ�Ƴ��ַ�����want you to know one thing��
       ����ĸn����ĸo�ĳ��ִ���
 *
 */
public class Count {

	public static void main(String[] args) {
        String str="want you to know one thing";
        System.out.println("n���ֵĴ����ǣ�"+count(str,'n'));
        System.out.println("o���ֵĴ����ǣ�"+count(str,'o'));
	}
	
	public static int count(String str,char c){
		int count=0;
		for(int i=0;i<str.length();i++){
			if(str.charAt(i)==c){
				count++;
			}
		}
		return count;
	}

}
