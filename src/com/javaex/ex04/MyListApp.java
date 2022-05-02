package com.javaex.ex04;

import java.util.ArrayList;

public class MyListApp {
	public static void main(String[] args) {
		
		ArrayList<Point> pList = new ArrayList<Point>();
		
		Point p01 = new Point(3,5);
		Point p02 = new Point(13,15);
		Point p03 = new Point(113,115);
		Point p04 = new Point(1113,1115);
		
		pList.add(p01);
		pList.add(p02);
		pList.add(p03);
		
		System.out.println(pList.size());
		System.out.println(pList.get(0).getX());
		System.out.println(pList.get(0).getY());
		System.out.println(pList.get(0).toString());
		System.out.println("---------------------------");
		
		for(int i=0; i<pList.size(); i++) {
			System.out.println(pList.get(i).toString());
		}
		
		pList.remove(p02); //=pList.remove(1);
		System.out.println("---------------------------");
		
		for(int i=0; i<pList.size(); i++) {
			System.out.println(pList.get(i).toString());
		}
		
		System.out.println("---------------------------");
		System.out.println(pList.toString());
		
		System.out.println("---------------------------");
		//for 다른 표현법-> 향상된 for문
		for(Point p : pList) {
			System.out.println(p.toString());
		}
		
		//p04 를 2번째(방번호 1번[1]째) 추가
		//pList.add(p04)
		pList.add(1, p04);
		System.out.println(pList.toString());
		
	}
}
