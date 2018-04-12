package set.treeset;

import java.util.TreeSet;

public class PersonTreeSet {

	public static void main(String[] args) {
		TreeSet<Girl> set=new TreeSet<Girl>();
        set.add(new Girl("小红",80,20.5));
        set.add(new Girl("小花",60,80.9));
        set.add(new Girl("小翠",95,2.5));
        set.add(new Girl("玉环",80,30.5));
        set.add(new Girl("小芳",80,30.5));
        for(Girl girl:set){
        	System.out.println(girl);
        }
        
	}

}
