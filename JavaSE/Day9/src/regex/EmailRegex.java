package regex;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EmailRegex {

	public static void main(String[] args) {
		String emailRegex="\\w+@\\w+\\.\\w+\\.?\\w+";
		
        Scanner scan=new Scanner(System.in);
        System.out.print("���������䣺");
        String email=scan.next();
        Pattern pat=Pattern.compile(emailRegex);  // ��������ʽ��װ��Pattern������
		Matcher mat=pat.matcher(email);   // ����һ��ƥ����Matcher,��Matcher������Ը���������ʽ�жϴ�����ַ����Ƿ����Ҫ��
		if(mat.matches()){
			System.out.println("��ϲ�������ʽ��ȷ��");
		}else{
			System.out.println("�Բ��������ʽ����ȷ��");
		}

	}

}
