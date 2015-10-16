package logical_codes;

public class Factorial {
	 int i;
	 int a = 5;
	 int fact = 1;

	public static void main(String[] args) {
		Factorial f=new Factorial();
		
		for (f.i = 1; f.i <= f.a; f.i++) {
			f.fact = f.fact * f.i;
			System.out.println("fact:" + f.fact);
		}
	}

}
