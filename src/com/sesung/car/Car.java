package com.sesung.car;

public class Car {
	
	Engien engine;
	Wheel [] wheels;
	String color;
	
	public void info(String color) {
		System.out.println(color);
		System.out.println(this.color);  //지역변수와 멤버변수를 구분하기 위해 this 사용. this도 참조 변수. 자기 객체(자신)을 가리키는 참조변수임. 참조변수에 객체의 주소가 담김.
		info2(); //참조변수 this 는 생략 가능함.
	}

	public void info2() {
		System.out.println("car~~~~~~~~~~");
//		this.info(""); 무한반복
	}
}
