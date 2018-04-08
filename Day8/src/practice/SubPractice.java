package practice;
/*
 * 分别截取字符串"   ABCmnyCW123   "中的"CmnyCW123"部分和"CW123"部分。
      提示：会使用到indexOf(xx) lastIndexOf(xxx) substring(xxx) trim()方法。
 * */
public class SubPractice {

	public static void main(String[] args) {
		String str="   ABCmnyCW123   ";
		int firstCIndex=str.indexOf("C");
		System.out.println(str.substring(firstCIndex).trim());
		int lastCIndex=str.lastIndexOf("C");
		System.out.println(str.substring(lastCIndex).trim());

	}

}
