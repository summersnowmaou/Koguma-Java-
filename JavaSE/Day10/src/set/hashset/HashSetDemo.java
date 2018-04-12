package set.hashset;

import java.util.HashSet;

public class HashSetDemo {

	public static void main(String[] args) {
		HashSet<String> set=new HashSet<String>();
		set.add("apple");
		set.add("banana");
		set.add("orange");
		set.add("apple");
		set.add("apple");
		for(String str:set){
			System.out.print(str+"  ");
		}

	}

}
