package set.treeset;

import java.util.TreeSet;

public class PersonTreeSet {

	public static void main(String[] args) {
		TreeSet<Girl> set=new TreeSet<Girl>();
        set.add(new Girl("С��",80,20.5));
        set.add(new Girl("С��",60,80.9));
        set.add(new Girl("С��",95,2.5));
        set.add(new Girl("��",80,30.5));
        set.add(new Girl("С��",80,30.5));
        for(Girl girl:set){
        	System.out.println(girl);
        }
        
	}

}
