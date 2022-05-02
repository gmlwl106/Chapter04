package com.javaex.ex01;

public class PointList {

	//필드
	private Point[] pArray;
	private int crtPos=0; //현재위치
	
	
	//생성자
	public PointList() {
		
		//배열3개->원래는 만들지 않음
		pArray = new Point[3];
	}
	
	
	//메소드gs
	
	
	
	//메소드 일반
	public void add(Point point) {
		//현재배열갯수+1
		//기존 배열의 내용은 그대로 배치
		//마지막방에 point를 대입
		
		
		pArray[crtPos] = point;
		crtPos++;
	}
	
	public int size() {
		return crtPos;
	}
	
	public Point get(int index) {
		return pArray[index];
	}
	
	
	
}
