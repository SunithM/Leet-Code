package com.suni.interview;

import java.util.Comparator;
import java.util.TreeSet;

class MyComparator implements Comparator<Integer> {
	/*
	 *
	 * @Override public int compare(Integer o1, Integer o2) { if(o1<o2) return 1;
	 * else if(o1>o2) return -1; return 0; }
	 * 
	 */
	
	public int compare(Integer I1,Integer I2) {
//		return -I1.compareTo(I2);
//		return I2.compareTo(I1);
//		return +1;
		return -1;
		
	}

}

public class ComparatorUsingTree {

	public static void main(String[] args) {
		TreeSet<Integer> treeSet = new TreeSet<>(new MyComparator());
		treeSet.add(10);
		treeSet.add(90);
		treeSet.add(7);
		treeSet.add(10);
		System.out.println(treeSet);
	}

}
