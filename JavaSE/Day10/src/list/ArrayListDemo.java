package list;

import java.util.*;

public class ArrayListDemo {

	public static void main(String[] args) {
		ArrayList<String> list=new ArrayList<String>();  
        list.add("apple");
        list.add("banana");
        list.add("orange");
        list.add("apple");  // List可以添加重复元素
        list.add("apple");  // List可以添加重复元素
        for(int i=0;i<list.size();i++){
        	System.out.print(list.get(i)+"  ");   // get(int index)方法是List接口扩展的方法
        }
        System.out.println();
        System.out.println("**********增强for循环遍历**********");
        for(String str:list){
        	System.out.print(str+"  ");
        }
        System.out.println();
        
        System.out.println("包含apple吗？"+list.contains("apple"));
        System.out.println("删除之前的元素个数："+list.size());
        list.remove("apple");
        System.out.println("删除之后的元素个数："+list.size());
        for(int i=0;i<list.size();i++){
        	System.out.print(list.get(i)+"  ");   // get(int index)方法是List接口扩展的方法
        }
	}

}
