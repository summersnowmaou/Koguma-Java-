package regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class GroupRegex {

	public static void main(String[] args) {
		String str="abchello123regexhello56789javascriptsajdfisjfaslfhello999slakjfldsf";
		String regex="\\w+(hello\\d+)\\w+(hello\\d+)";
		Pattern pat=Pattern.compile(regex);
		Matcher mat=pat.matcher(str);
		
		System.out.println(mat.find());
		System.out.println(mat.group(0));
		System.out.println(mat.group(1));
		System.out.println(mat.group(2));
		

	}

}
