package comparator;

import java.util.TreeSet;

public class TreeSetDemo {

	public static void main(String[] args) {
		TreeSet<Girl> ts1=new TreeSet<Girl>(new FaceRule());
		ts1.add(new Girl("小红",80,20.5));
		ts1.add(new Girl("小草",99,1.1));
		ts1.add(new Girl("小翠",60,20.5));
		ts1.add(new Girl("小娟",80,60.5));
		ts1.add(new Girl("小花",40,50.5));
		System.out.println("以face为第一标准：");
		for(Girl g:ts1){
			System.out.println(g);
		}
		
		System.out.println("********************************");
		System.out.println("以money为第一标准：");
		TreeSet<Girl> ts2=new TreeSet<Girl>(new MoneyRule());
		ts2.add(new Girl("小红",80,20.5));
		ts2.add(new Girl("小草",99,1.1));
		ts2.add(new Girl("小翠",60,20.5));
		ts2.add(new Girl("小娟",80,60.5));
		ts2.add(new Girl("小花",40,50.5));
		for(Girl g:ts2){
			System.out.println(g);
		}

	}

}
