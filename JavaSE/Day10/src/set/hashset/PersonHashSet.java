package set.hashset;

import java.util.HashSet;

public class PersonHashSet {

	public static void main(String[] args) {
		HashSet<Person> set=new HashSet<Person>();
		set.add(new Person("����",20));
		set.add(new Person("����",22));
		set.add(new Person("����",21));
		set.add(new Person("����",20));
		set.add(new Person("����",20));
		
		for(Person per:set){
			System.out.println(per);
		}

	}

}
