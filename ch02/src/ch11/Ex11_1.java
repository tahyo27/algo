package ch11;

import java.util.*;

public class Ex11_1 {

	public static void main(String[] args) {
		//자바8 옛날 방식인듯
		ArrayList list1 = new ArrayList(10);
		
		list1.add(5);
		list1.add(4);
		list1.add(3);
		list1.add(0);
		list1.add(1);
		list1.add(2);
		
		
		
		ArrayList list2 = new ArrayList(list1.subList(1, 4));
		System.out.println("list1: " + list1);
		System.out.println("list2: " + list2);
		
		Collections.sort(list1);
		Collections.sort(list2);
		
		System.out.println("list1: " + list1);
		System.out.println("list2: " + list2);
		
		System.out.println("list1.containsAll(list2): " + list1.containsAll(list2));;
		
		list2.add("B");
		list2.add("C");
		
		list2.add(3, "A");
		System.out.println("list1: " + list1);
		System.out.println("list2: " + list2);
		
	}

}
