package set.hashset;

import java.util.HashSet;

public class PersonHashSet {

	public static void main(String[] args) {
		HashSet<Person> set=new HashSet<Person>();
		set.add(new Person("张三",20));
		set.add(new Person("李四",22));
		set.add(new Person("王五",21));
		set.add(new Person("张三",20));
		set.add(new Person("张三",20));
		
		for(Person per:set){
			System.out.println(per);
		}

	}

}
