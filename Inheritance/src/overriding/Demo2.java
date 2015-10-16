package overriding;

public class Demo2 extends Demo1{
	public void area(int a,int b){
	//private void area(int a,int b) {
		System.out.println("method of subclass");
		System.out.println(a);
		System.out.println(b);
		
	}
	//public void circumference(int b){
	protected void circumference(int b) {
		System.out.println("method of subclass");
		System.out.println(b);
		
	}
	//green symbol indicates that method is overrided
	//public void parameter(int b){
	private void parameter(int b) {
		System.out.println("method of superclass");
		System.out.println(b);
		
	}


}
