package regex;

public class StringRegex {

	public static void main(String[] args) {
		String str="hello1java22regex333python4444C55555";
		if(str.matches("\\w+")){
			System.out.println("匹配成功！");
		}
		System.out.println("替换后的字符串为："+str.replaceAll("\\d+","#"));
		
		String country="中国|美国|俄罗斯|德国";
		String[] array=country.split("\\|");
		for(String c:array){
			System.out.print(c+"  ");
		}

	}

}
