public abstract class AbsDemo {
	int c; //abstract keyword cant be written with instant variable

	AbsDemo() {
		System.out.println("3rd constructor");
	}

	{

	}

	void key() {
		System.out.println("3rd method");
	}

	static {

	}
	abstract void method1 (); //when method is abstract then method does not have body & class 
	                              //should be abstract only otherwise compile time error
	void method2(){
		// abstract class can have non abstract as well
	}
	//static abstract void method3(); we can't write static abstract together
}
