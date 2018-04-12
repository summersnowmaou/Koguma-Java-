package iterator;
import java.util.*;
public class IteratorDemo {

	public static void main(String[] args) {
		ArrayList<String> list=new ArrayList<>();
		Collections.addAll(list,"China","America","Japan","China","France");
		Iterator<String> iter=list.iterator();   // 返回List集合的迭代器
		// 通过迭代器遍历集合
		while(iter.hasNext()){
			System.out.print(iter.next()+"  ");
		}

	}

}
