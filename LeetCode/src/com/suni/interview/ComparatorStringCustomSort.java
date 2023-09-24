package com.suni.interview;

import java.util.Comparator;
import java.util.TreeSet;

class MyComparator2 implements Comparator<String>{
	public int compare(String s1,String s2) {
		return -s1.compareTo(s2);
	}
}
public class ComparatorStringCustomSort {


	public static void main(String[] args) {
		TreeSet<String> treeSet=new TreeSet<>(new MyComparator2());
		treeSet.add("Apple");
		treeSet.add("Zebra");
		treeSet.add("Camel");
		treeSet.add("Ramesh");
		System.out.println(treeSet);
		
	}

}
