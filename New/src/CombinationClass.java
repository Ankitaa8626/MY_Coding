public class CombinationClass {
	final static int d = 10;
	static {
		System.out.println(d); //component should be static in static block
		
	}
	static final void method1(){
		System.out.println("mix method");
	}

	public static void main(String[] args) {
		System.out.println(CombinationClass.d);
		CombinationClass.method1();
	}
}
