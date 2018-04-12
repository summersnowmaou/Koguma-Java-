package set.treeset;

import java.util.TreeSet;

public class TreeSetDemo {

	public static void main(String[] args) {
		TreeSet<String> set=new TreeSet<String>();
		set.add("X");
		set.add("A");
		set.add("Y");
		set.add("B");
		set.add("A");
		set.add("Y");
		for(String str:set){
			System.out.print(str+"  ");
		}

	}

}
