package com.clc.learning.foreclass;

import com.clc.learning.sub.Bike;
import com.clc.learning.superclass.Vehicle;

public class OverRidingTest {
	public static void main(String[] args) {
		Vehicle v = new Vehicle();
		Bike b = new Bike();
		Bike2 d = new Bike2();
		//v.run(); as default acess modifier can't be access in another package
		//v.guarantee();
		//b.run();
		//b.name();
		d.run();//as in same package 
		d.guarantee();
		d.name();
		
	}

}
