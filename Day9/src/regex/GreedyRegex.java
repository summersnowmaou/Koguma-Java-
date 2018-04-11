package regex;

public class GreedyRegex {

	public static void main(String[] args) {
		String str="abbbbbbb";
		System.out.println("Ì°À·Ä£Ê½Æ¥Åä: "+str.replaceAll("ab+","#"));    // "Ì°À·Æ¥Åä"
		System.out.println("·ÇÌ°À·Ä£Ê½Æ¥Åä: "+str.replaceAll("ab+?","#"));

	}

}
