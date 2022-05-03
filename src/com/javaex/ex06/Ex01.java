package com.javaex.ex06;

import java.util.HashSet;
import java.util.Set;

public class Ex01 {
	public static void main(String[] args) {
		
		Set<Integer> lotto = new HashSet<Integer>();
		
		while(true) {
		
			if(lotto.size() < 6) {
				lotto.add((int) ((Math.random()*45)+1));
			} else {
				break;
			}
		}
		
		
		for(Integer num:lotto) {
			System.out.print(num.toString() + "\t");
		}
	}
}
