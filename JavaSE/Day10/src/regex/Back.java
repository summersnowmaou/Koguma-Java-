package regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Back {

	public static void main(String[] args) {
		String str="slkadjfkaldjflkjdudulaakjsdfklxyxykljsfklpopoasddfsadf";
		/*
		 * ��������ʽ�У�\num�����������á���num�������е�����
		 * */
		String regex="([A-Za-z]{2})\\1";
		Pattern pat=Pattern.compile(regex);
		Matcher mat=pat.matcher(str);
		while(mat.find()){
			System.out.println(mat.group(0));
		}

	}

}
