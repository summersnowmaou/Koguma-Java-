package list;

import java.util.LinkedList;

public class LinkedListDemo {

	public static void main(String[] args) {
		System.out.println("ģ��ջ���ݽṹ(�Ƚ����FILO)��");
		LinkedList<String> list=new LinkedList<String>();
		list.push("A");
		list.push("B");
		list.push("C");
		System.out.println(list.pop());
		System.out.println(list.pop());
		System.out.println(list.pop());
		System.out.println("ģ��������ݽṹ(�Ƚ��ȳ�FIFO)��");
		list.add("A");
		list.add("B");
		list.add("C");
		System.out.println(list.removeFirst());
		System.out.println(list.removeFirst());
		System.out.println(list.removeFirst());
	}

}
