package com.javaex.ex05;

import java.util.HashSet;
import java.util.Set;

public class Ex01 {
	public static void main(String[] args) {
		
		Set<Integer> iset = new HashSet<Integer>();
		
		//iset.add(12); //자동으로 박싱됨 int->Integer
		
		Integer i01 = 4;
		Integer i02 = 14;
		Integer i03 = 114;
		
		iset.add(i01);
		iset.add(i02);
		iset.add(i03);
		
		System.out.println(iset.size());
		System.out.println(iset.toString());
		
		System.out.println("----------------------");
		for(Integer num : iset) {
			System.out.println(num.toString());
		}
		System.out.println("----------------------");
		
		//중복체크
		Integer i04 = 14;
		iset.add(i04);
		for(Integer num : iset) {
			System.out.println(num.toString());
		}
		
		
		
	}
}
