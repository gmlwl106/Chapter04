package com.javaex.ex03;


public class MyList<T> {

	//필드
	private T[] oArray;
	private int crtPos=0; //현재위치
	
	
	//생성자
	public MyList() {
		
		//배열3개->원래는 만들지 않음
		oArray = (T[])new Object[3];
	}
	
	
	//메소드gs
	
	
	
	//메소드 일반
	public void add(T obj) { //Object로 자동형변환(업캐스팅)
		//현재배열갯수+1
		//기존 배열의 내용은 그대로 배치
		//마지막방에 point를 대입
		
		
		oArray[crtPos] = obj;
		crtPos++;
	}
	
	public int size() {
		return crtPos;
	}
	
	public T get(int index) {
		return oArray[index];
	}
}
