package list;

import java.util.*;

public class ArrayListDemo {

	public static void main(String[] args) {
		ArrayList<String> list=new ArrayList<String>();  
        list.add("apple");
        list.add("banana");
        list.add("orange");
        list.add("apple");  // List��������ظ�Ԫ��
        list.add("apple");  // List��������ظ�Ԫ��
        for(int i=0;i<list.size();i++){
        	System.out.print(list.get(i)+"  ");   // get(int index)������List�ӿ���չ�ķ���
        }
        System.out.println();
        System.out.println("**********��ǿforѭ������**********");
        for(String str:list){
        	System.out.print(str+"  ");
        }
        System.out.println();
        
        System.out.println("����apple��"+list.contains("apple"));
        System.out.println("ɾ��֮ǰ��Ԫ�ظ�����"+list.size());
        list.remove("apple");
        System.out.println("ɾ��֮���Ԫ�ظ�����"+list.size());
        for(int i=0;i<list.size();i++){
        	System.out.print(list.get(i)+"  ");   // get(int index)������List�ӿ���չ�ķ���
        }
	}

}
