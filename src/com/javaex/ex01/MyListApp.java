package com.javaex.ex01;

public class MyListApp {
	public static void main(String[] args) {
		/*
		Point[] pArray = new Point[100]; //배열의 단점:갯수를 미리 정해야한다.
		Point p00 = new Point(2,3);
		Point p01 = new Point(12,13);
		Point p02 = new Point(22,23);
		
		pArray[0] = p00;
		pArray[1] = p01;
		pArray[2] = p02;
		
		System.out.println(pArray[0].toString());
		System.out.println(pArray[1].toString());
		System.out.println(pArray[2].toString());
		*/
		
		//Point관리=======================================================
		PointList pList = new PointList();
		
		Point p00 = new Point(2,3);
		Point p01 = new Point(12,13);
		Point p02 = new Point(22,23);
		
		pList.add(p00);
		pList.add(p01);
		pList.add(p02);
		
		System.out.println(pList.size());
		System.out.println(pList.get(1));
		

		Point p = pList.get(1);
		System.out.println(p.getX());
		
		for(int i=0; i<pList.size(); i++) {
			System.out.println(pList.get(i).toString());
		}

		
		//Circle관리=========================================================
		CircleList cList = new CircleList();
		Circle c01 = new Circle(5);
		cList.add(c01);
		Circle c02 = new Circle(1);
		cList.add(c02);
		Circle c03 = new Circle(60);
		cList.add(c03);
		
		System.out.println(cList.size());
		System.out.println(cList.get(1).getRadius());
		
		for(int i=0; i<cList.size(); i++) {
			System.out.println(cList.get(i).toString());
		}
		
	
	}	
}
