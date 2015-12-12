package keywords;

public class FinalKey {
	final int a;
	final int b = 455;

	FinalKey(final int a) {
		this.a = a;
		// a=7; here we can't change the value of variable a bcoz we have return
		// final keyword
	}

	void call() {

	}

}
