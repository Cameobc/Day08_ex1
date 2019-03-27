package com.sesung.mobile;

public class MobileMain {
	public static void main(String[] args) {
		PhoneView pv = new PhoneView();
		
		Phone phone = new Phone();//클래스명 참조변수
		Phone phone2 = new Phone();
	
		pv.view(phone);
		
	}

}
