package overriding;

public class Demo {
	//public void area(int a, int b) {
	//private void area(int a, int b){
	protected void area(int a, int b){
		System.out.println("method of superclass");
		System.out.println(a);
		System.out.println(b);

	}

	//public void parameter(int b) {
	private void parameter(int b) {
		System.out.println("method super");
		System.out.println(b);

	}

}
