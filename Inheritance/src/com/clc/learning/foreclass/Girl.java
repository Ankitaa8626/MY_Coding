package com.clc.learning.foreclass;

import com.clc.learning.sub.Female;

public class Girl extends Female {
	private int age=24;
	protected boolean honest=true;
	public void eat() {
		System.out.println("Human is eating");
	}

	//default can't be overrided outside the package
	void walk() {
		System.out.println("human is walking");
	}
	//protected can be overrided outside the package due to inheritance
	protected void laugh() {
		System.out.println("laughing");
	}
}
