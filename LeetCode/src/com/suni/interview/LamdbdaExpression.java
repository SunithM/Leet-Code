package com.suni.interview;

import java.util.ArrayList;
import java.util.List;

public class LamdbdaExpression {

	public static void main(String[] args) {
		List<Integer> lst=new ArrayList<Integer>();
		lst.add(12);
		lst.add(10);
		lst.add(39);
		lst.forEach(i->System.out.println("i="+i));
	
	}

}
