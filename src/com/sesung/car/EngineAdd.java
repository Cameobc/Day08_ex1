package com.sesung.car;

public class EngineAdd {
	public Car setEngine(Car car) {
		Engien engien = new Engien();
		engien.hp=100;
		engien.cc=1000;
		engien.fuel = "gas";
		
		car.engine =engien;
				return car;
	}

}
