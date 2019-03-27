package com.sesung.mobile;

public class Phone {
	
	String brand="Samsung";
	int price;
	String color;
	int size;
	
	public Phone() {
		//디폴트 생성자 or 빈생성자 or 기본생성자->매개변수가 없는 생성자
		//클래스내에 생성자가 하나라도 없으면 컴파일러가 디폴트생성자를 하나 생성함.
		this.brand="LG";
		this.price=200;
		color="Red";
		size = 15;
		System.out.println("Phone 제작이 완료 되었습니다.");
		this.info();
	}
	
	public void info() { //멤버메서드
		System.out.println("Phone~~");
	}
	

}
