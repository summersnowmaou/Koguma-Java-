package regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexMatch {

	public static void main(String[] args) {
		String birthday="1994-02-25";
		String regex="\\d{4}-\\d{2}-\\d{2}";
		Pattern pat=Pattern.compile(regex);  // ��������ʽ��װ��Pattern������
		Matcher mat=pat.matcher(birthday);   // ����һ��ƥ����Matcher,��Matcher������Ը���������ʽ�жϴ�����ַ����Ƿ����Ҫ��
		if(mat.matches()){
			System.out.println("ƥ��ɹ���");
		}else{
			System.out.println("ƥ��ʧ��...");
		}

	}

}
