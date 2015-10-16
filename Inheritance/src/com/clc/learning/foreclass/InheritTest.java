package com.clc.learning.foreclass;

import com.clc.learning.sub.*;
//import com.clc.learning.sub.Son;
import com.clc.learning.superclass.Parent;

public class InheritTest {
	public static void main(String[] args) {
		GrandSon R = new GrandSon();
		ChildClass L = new ChildClass();
		Son H = new Son();
		Parent T = new Parent();
		System.out.println(R.g);
		System.out.println(R.height);
		System.out.println(R.age);
		//System.out.println(R.ww);
		//System.out.println(T.g);
		//System.out.println(L.g);
		//System.out.println(H.g);
		//System.out.println(H.weight);
		//System.out.println(H.height);

	}

}
