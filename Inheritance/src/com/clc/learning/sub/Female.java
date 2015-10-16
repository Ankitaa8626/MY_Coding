package com.clc.learning.sub;

import com.clc.learning.superclass.Human;

public class Female extends Human {
	private int age=22;
	public int height=5;

	public void eat() {
		System.out.println("female is eating");
	}

	protected void laugh() {
		System.out.println("laughing");
	}

}
