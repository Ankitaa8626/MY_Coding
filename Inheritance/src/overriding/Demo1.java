package overriding;

public class Demo1 extends Demo {
	 public void area(int a, int b) {
	//private void area(int a, int b) {
		System.out.println("extended method of super class");
		System.out.println(a);
		System.out.println(b);
	}

	// public void circumference(int b) {
	protected void circumference(int b) {
		System.out.println("subclass method");
		System.out.println(b);

	}

}
