package generic;

import java.util.*;

public class GenericDemo {

	public static void main(String[] args) {
		ArrayList<String> list=new ArrayList<String>();
        list.add("apple");
        list.add("banana");
        for(String data:list){
        	System.out.print(data+"  ");
        }
        
        method(list);
        method(new ArrayList<Object>());
	}
	
	public static void method(List<? super String> list){
		List<String> temp=(List<String>)list;
		temp.add("abc");
	}
	
	

}
