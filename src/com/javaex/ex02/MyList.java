package com.javaex.ex02;


public class MyList {

	//필드
	private Object[] oArray;
	private int crtPos=0; //현재위치
	
	
	//생성자
	public MyList() {
		
		//배열3개->원래는 만들지 않음
		oArray = new Object[3];
	}
	
	
	//메소드gs
	
	
	
	//메소드 일반
	public void add(Object obj) { //Object로 자동형변환(업캐스팅)
		//현재배열갯수+1
		//기존 배열의 내용은 그대로 배치
		//마지막방에 point를 대입
		
		
		oArray[crtPos] = obj;
		crtPos++;
	}
	
	public int size() {
		return crtPos;
	}
	
	public Object get(int index) {
		return oArray[index];
	}
}
