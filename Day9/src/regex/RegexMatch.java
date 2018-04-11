package regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexMatch {

	public static void main(String[] args) {
		String birthday="1994-02-25";
		String regex="\\d{4}-\\d{2}-\\d{2}";
		Pattern pat=Pattern.compile(regex);  // 将正则表达式封装到Pattern对象中
		Matcher mat=pat.matcher(birthday);   // 创建一个匹配器Matcher,该Matcher对象可以根据正则表达式判断传入的字符串是否符合要求
		if(mat.matches()){
			System.out.println("匹配成功！");
		}else{
			System.out.println("匹配失败...");
		}

	}

}
