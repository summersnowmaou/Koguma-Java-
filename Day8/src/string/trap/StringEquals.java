package string.trap;

public class StringEquals {

	public static void main(String[] args) {
        String str1="hello";
        String str2="hello";
        System.out.println(str1==str2);
        System.out.println(str1.equals(str2));
        System.out.println("*********************************");
        String str3=new String("hello");
        System.out.println(str1==str3);
        System.out.println(str1.equals(str3));
	}

}
