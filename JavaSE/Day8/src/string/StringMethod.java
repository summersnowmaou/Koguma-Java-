package string;

public class StringMethod {

	public static void main(String[] args) {
		String str="�л����񹲺͹�";
		System.out.println(str.charAt(2));  // ��������λ�û�ȡ�ַ����е�ĳ���ַ�
        System.out.println(str.contains("����"));   // �жϵ�ǰ���������ַ����Ƿ���������ַ�������
        System.out.println(str.indexOf("�񹲺�"));
        // ��"abcde"��d��Ϊ��д
        String s1="abcdedx";
        System.out.println("�Ӻ���ǰ��d:"+s1.lastIndexOf("d"));
        String s2="wxYz";
        System.out.println(s2.toUpperCase());
        System.out.println(s2.toLowerCase());
        System.out.println("�л����񹲺͹�".substring(3));
        System.out.println("�л����񹲺͹�".substring(3,6));
        String s3="   ��     ��     ��  ";
        System.out.println("s3�ĳ��ȣ�"+s3.length());
        System.out.println("ɾ����ǰ��ո��ĳ��ȣ�"+s3.trim().length());
        System.out.println("*************************************");
        String country="�й�,����,����˹,�����,���";
        String[] array=country.split(",");
        System.out.println("������ֺ���ַ�����");
        for(String cou:array){
        	System.out.print(cou+"  ");
        }
	}

}
