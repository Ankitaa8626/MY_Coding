package overriding;

public class Demo3 {
	public static void main(String[] args) {
		ExampleOverRinding a=new ExampleOverRinding();
		SubClass b= new SubClass();
		TestOfOverRiding c= new TestOfOverRiding();
		a.area(4,5);
		a.parameter(7);
		b.area(5, 2);
		b.circumference(6);
		b.parameter(7);
		c.area(44,45);
		c.circumference(56);
		c.parameter(74);
		
	}
}
