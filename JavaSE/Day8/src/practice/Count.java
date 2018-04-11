package practice;
/**
 * 
 * 编写程序，统计出字符串“want you to know one thing”
       中字母n和字母o的出现次数
 *
 */
public class Count {

	public static void main(String[] args) {
        String str="want you to know one thing";
        System.out.println("n出现的次数是："+count(str,'n'));
        System.out.println("o出现的次数是："+count(str,'o'));
	}
	
	public static int count(String str,char c){
		int count=0;
		for(int i=0;i<str.length();i++){
			if(str.charAt(i)==c){
				count++;
			}
		}
		return count;
	}

}
