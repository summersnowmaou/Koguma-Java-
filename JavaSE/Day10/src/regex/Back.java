package regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Back {

	public static void main(String[] args) {
		String str="slkadjfkaldjflkjdudulaakjsdfklxyxykljsfklpopoasddfsadf";
		/*
		 * 在正则表达式中，\num代表“反向引用”第num个分组中的内容
		 * */
		String regex="([A-Za-z]{2})\\1";
		Pattern pat=Pattern.compile(regex);
		Matcher mat=pat.matcher(str);
		while(mat.find()){
			System.out.println(mat.group(0));
		}

	}

}
