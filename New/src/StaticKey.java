public class StaticKey { // static keyword can't be written
	static int b;

	StaticKey() {
		System.out.println("2nd constructor");
	}

	StaticKey(int b) {
		this.b = b;
	}

	{

	}

	static void key() {
		System.out.println("2nd method");
	}

	void key2() {

	}

	static {

	}

	public static void main(String[] args) {
		//StaticKey key = null;
		StaticKey.key();
		//StaticKey.key2();
	}
}
