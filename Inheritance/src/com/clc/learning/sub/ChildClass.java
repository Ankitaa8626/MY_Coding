package com.clc.learning.sub;

import com.clc.learning.superclass.Parent;

public class ChildClass extends Parent {
	public int weight = 45;
	public int height = 5;

	public void son() {
		System.out.println("child class");

	}

	public static void main(String[] args) {
		ChildClass a = new ChildClass();
		Parent b = new Parent();
		System.out.println(a.age);
		// System.out.println(b.age);
	}

}
