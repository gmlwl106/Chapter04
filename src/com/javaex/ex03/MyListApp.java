package com.javaex.ex03;

public class MyListApp {

	public static void main(String[] args) {

		MyList<Point> pList = new MyList<Point>();
		
		Point p01 = new Point(3, 5);
		Point p02 = new Point(13, 15);
		Point p03 = new Point(23, 12);
		
		pList.add(p01);
		pList.add(p02);
		pList.add(p03);
		
		System.out.println(pList.size());
		System.out.println(pList.get(0).toString());
		
		System.out.println("-------------------");
		for(int i=0; i<pList.size(); i++) {
			/*Point p = (Point)pList.get(i);
			System.out.println(p.getX()); 형변환이 필요없어짐*/
			System.out.println(pList.get(i).getX());
		}
		
		System.out.println("======================================");
		//원관리
		MyList<Circle> cList = new MyList<Circle>();
		
		Circle c01 = new Circle(2);
		Circle c02 = new Circle(5);
		
		cList.add(c01);
		cList.add(c02);
		//cList.add(p01); Generic으로 Circle만 관리함
		
		System.out.println(cList.size());
		System.out.println(cList.get(0).toString());
		
		System.out.println("-------------------");
		for(int i=0; i<cList.size(); i++) {
			/*Circle c = (Circle)cList.get(i);
			System.out.println(c.toString());*/
			System.out.println(cList.get(i).getRadius());
		}
		
	}

}
