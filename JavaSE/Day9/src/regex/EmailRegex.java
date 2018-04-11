package regex;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EmailRegex {

	public static void main(String[] args) {
		String emailRegex="\\w+@\\w+\\.\\w+\\.?\\w+";
		
        Scanner scan=new Scanner(System.in);
        System.out.print("请输入邮箱：");
        String email=scan.next();
        Pattern pat=Pattern.compile(emailRegex);  // 将正则表达式封装到Pattern对象中
		Matcher mat=pat.matcher(email);   // 创建一个匹配器Matcher,该Matcher对象可以根据正则表达式判断传入的字符串是否符合要求
		if(mat.matches()){
			System.out.println("恭喜，邮箱格式正确！");
		}else{
			System.out.println("对不起，邮箱格式不正确！");
		}

	}

}
