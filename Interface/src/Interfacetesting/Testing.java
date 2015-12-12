package Interfacetesting;

import java.util.ArrayList;

public class Testing extends MethodTesting{
	public static void main(String[] args) {
		Testing test=new Testing();
		Vehical vehical= new Vehical();
		//ArrayList al=new ArrayList();
		//test.method1(al);
		test.method1(new ArrayList());
		//test.method2(al);
		test.method2(new ArrayList());
		//test.method3(new Vehical());
		test.method3(vehical);
		
	}

}
