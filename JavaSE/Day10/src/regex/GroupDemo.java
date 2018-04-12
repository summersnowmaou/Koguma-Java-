package regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class GroupDemo {

	public static void main(String[] args) {
		String str="asdfhello123saddfdsafhello5678askljfasfdjhello999asdfds";
		String regex="(hello\\d+)";
		Pattern pat=Pattern.compile(regex);
		Matcher mat=pat.matcher(str);
		while(mat.find()){
			System.out.println(mat.group(1));
		}

	}

}
