package com.javaex.ex08;

import java.util.HashSet;
import java.util.Set;

public class PointApp {
	public static void main(String[] args) {
		
		Set<Point> pSet = new HashSet<Point>();
		
		Point p01 = new Point(1, 2);
		Point p02 = new Point(3, 1);
		Point p03 = new Point(4, 3);

		pSet.add(p01);
		pSet.add(p02);
		pSet.add(p03);
		
		/*
		for(Point p : pSet) {
			System.out.println(pSet.toString());
		}
		*/
		
		System.out.println(pSet.toString());
		System.out.println("---------------------------------------------------");
		
		Point p04 = new Point(3, 1);
		pSet.add(p04); //중복이라서 입력되지않음
		
		System.out.println(pSet.toString());
		System.out.println("---------------------------------------------------");
		
		//hashCode 출력
		for(Point p : pSet) {
			System.out.println(p.hashCode());
		}
		
		
	}
}
