package com.sesung.car;

public class CarFactory {
	public void makeCar() {
		EngineAdd en = new EngineAdd();
		WheelAdd wa = new WheelAdd();
		CarView cv = new CarView();
		ColorPaint cp = new ColorPaint();
		
		Car car = new Car(); //Car() 매서드임
		car = en.setEngine(car);
		car = wa.setWheel(car);
		cp.setColor(car);
//		cv.view(car);
		car.info("Blue");
		Car car2 = new Car();
		car2.color="White";
		car2.info("Red");
	}

}
