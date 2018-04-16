package homework;

import java.util.*;
import java.util.Map.Entry;

public class Count {

	public static void main(String[] args) {
		String str="sdfgzxcvasdfxcvdf";
		///System.out.println(str.length());
		TreeMap<Character,Integer> map=count(str);
		Set<Entry<Character, Integer>> entrySet = map.entrySet();
		for(Entry<Character, Integer> me:entrySet){
			System.out.print(me.getKey()+"("+me.getValue()+")  ");
		}

	}
	
	public static TreeMap<Character,Integer> count(String str){
		TreeMap<Character,Integer> map=new TreeMap<Character,Integer>();
		char[] array=str.toCharArray();
		for (int i = 0; i < array.length; i++) {
			Integer count=map.get(array[i]);   // 获取当前正在遍历的字符对应的次数
			if(count==null){
				map.put(array[i],1);
			}else{
				map.put(array[i],count+1);
			}
		}
		return map;
	}

}
