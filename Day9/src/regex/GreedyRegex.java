package regex;

public class GreedyRegex {

	public static void main(String[] args) {
		String str="abbbbbbb";
		System.out.println("̰��ģʽƥ��: "+str.replaceAll("ab+","#"));    // "̰��ƥ��"
		System.out.println("��̰��ģʽƥ��: "+str.replaceAll("ab+?","#"));

	}

}
