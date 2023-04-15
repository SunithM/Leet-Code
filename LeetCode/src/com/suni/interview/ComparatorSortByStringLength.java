package com.suni.interview;

import java.util.Comparator;
import java.util.TreeSet;

class MyComparator3 implements Comparator<String>{

	@Override
	public int compare(String o1, String o2) {
		if(o1.length()>o2.length())
			return +1;
		else if(o1.length()<o2.length())
			return -1;
		else
			return o1.compareTo(o2);
	}
	
}
public class ComparatorSortByStringLength {
	
	
	public static void main(String[] args) {
		TreeSet<String> treeSet=new TreeSet<>(new MyComparator3());
		treeSet.add("Apple");
		treeSet.add("Zebra");
		treeSet.add("Camel");
		treeSet.add("Ramesh");
		treeSet.add("Hi");
		treeSet.add("Longest one");
		System.out.println(treeSet);
	}

}
