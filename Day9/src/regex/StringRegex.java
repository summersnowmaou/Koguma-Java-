package regex;

public class StringRegex {

	public static void main(String[] args) {
		String str="hello1java22regex333python4444C55555";
		if(str.matches("\\w+")){
			System.out.println("ƥ��ɹ���");
		}
		System.out.println("�滻����ַ���Ϊ��"+str.replaceAll("\\d+","#"));
		
		String country="�й�|����|����˹|�¹�";
		String[] array=country.split("\\|");
		for(String c:array){
			System.out.print(c+"  ");
		}

	}

}
