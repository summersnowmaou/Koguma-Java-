package string;

public class StringMethod {

	public static void main(String[] args) {
		String str="中华人民共和国";
		System.out.println(str.charAt(2));  // 根据索引位置获取字符串中的某个字符
        System.out.println(str.contains("人民"));   // 判断当前对象代表的字符串是否包含参数字符串内容
        System.out.println(str.indexOf("民共和"));
        // 将"abcde"的d变为大写
        String s1="abcdedx";
        System.out.println("从后往前找d:"+s1.lastIndexOf("d"));
        String s2="wxYz";
        System.out.println(s2.toUpperCase());
        System.out.println(s2.toLowerCase());
        System.out.println("中华人民共和国".substring(3));
        System.out.println("中华人民共和国".substring(3,6));
        String s3="   中     国     人  ";
        System.out.println("s3的长度："+s3.length());
        System.out.println("删除了前后空格后的长度："+s3.trim().length());
        System.out.println("*************************************");
        String country="中国,美国,俄罗斯,意大利,瑞典";
        String[] array=country.split(",");
        System.out.println("遍历拆分后的字符串：");
        for(String cou:array){
        	System.out.print(cou+"  ");
        }
	}

}
