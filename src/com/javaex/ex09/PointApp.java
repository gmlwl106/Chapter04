package com.javaex.ex09;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class PointApp {
	public static void main(String[] args) {
		
		Map<String, Point> pMap = new HashMap<String, Point>();
		
		Point p01 = new Point(1, 2);
		Point p02 = new Point(3, 1);
		Point p03 = new Point(4, 3);
		
		pMap.put("정우성", p01);
		pMap.put("이효리", p02);
		pMap.put("박명수", p03);
		
		System.out.println(pMap.size());
		System.out.println(pMap.toString());
		
		System.out.println(pMap.get("정우성").getX());
		
		//같은 키값으로 추가
		Point p04 = new Point(100, 200);
		pMap.put("정우성", p04);
		System.out.println(pMap.get("정우성").toString());
		
		//다른 키값으로 추가
		Point p05 = new Point(3, 1);
		pMap.put("유재석", p05);
		System.out.println(pMap.toString());
		
		//전체출력
		//1. 키 목록을 만든다.
		//2. pMap.get("이름")
		Set<String> keys = pMap.keySet();
		System.out.println(keys.toString());
		
		for(String name : keys) {
			System.out.println(pMap.get(name).toString());
		}
		
		
	}
}
