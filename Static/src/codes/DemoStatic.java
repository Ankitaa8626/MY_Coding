package codes;

public class DemoStatic {
	int a=5;
	static int b;
	static int m;

	void run() {
		laugh();
		System.out.println("instance method");
	}

	static int laugh() {
		System.out.println("static method");
return 2;
	}

	static {
		System.out.println("static block");
		//run();
		System.out.println(m);

	}
	{
		System.out.println("instance block");
	}
	DemoStatic(){
		System.out.println("constructor");
	}

	public static void main(String[] args) {
		DemoStatic f=new DemoStatic();
		
		System.out.println(b);
		System.out.println(f.a);
		laugh();

	}
}
