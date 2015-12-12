package codes;

public class Modifier {
	//Modifier() {
		//System.out.println("default constructor");
	//}

	//public Modifier() {
		//System.out.println("public contructor");

	//}

	private Modifier() {
		System.out.println("private constructor");
	}

	public Modifier(char d) {
		System.out.println("protected");

	}
	public static void main(String[] args) {
		Modifier m=new Modifier();
	//	Modifier('d');
		
	}
}
