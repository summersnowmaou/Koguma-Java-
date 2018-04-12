package collections;

import java.util.*;

public class CollectionsDemo {

	public static void main(String[] args) {
        List<String> list=new ArrayList<String>();
        Collections.addAll(list,"Apple","Banana","Orange","Apple","Watermelon");
        showList(list);
        
        Collections.shuffle(list);   // 打乱List集合中的元素
        System.out.println("打乱之后：");
        showList(list);
        Collections.reverse(list);   // 反转List集合
        System.out.println("反转之后：");
        showList(list);
	}
	
	public static void showList(List<String> list){
		for(String str:list){
        	System.out.print(str+"  ");
        }
		System.out.println();
	}

}
