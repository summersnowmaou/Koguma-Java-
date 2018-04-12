package collections;

import java.util.*;

public class CollectionsDemo {

	public static void main(String[] args) {
        List<String> list=new ArrayList<String>();
        Collections.addAll(list,"Apple","Banana","Orange","Apple","Watermelon");
        showList(list);
        
        Collections.shuffle(list);   // ����List�����е�Ԫ��
        System.out.println("����֮��");
        showList(list);
        Collections.reverse(list);   // ��תList����
        System.out.println("��ת֮��");
        showList(list);
	}
	
	public static void showList(List<String> list){
		for(String str:list){
        	System.out.print(str+"  ");
        }
		System.out.println();
	}

}
