public  class FinalKey {
	final int a ;

//	FinalKey() {
//		super();
//		System.out.println("1st constructor");
//	}

	FinalKey(final int a) {
		super();
		this.a = a;
	}

	{

	}

	void key() {
		System.out.println("1st method");
	}
	final void method1(final int variable){
		final int result=variable+5;
	}

	static {
//System.out.println(a);
	}
	public static void main(String[] args) {
		
	}
}
