package keywords;

public final class Example extends FinalKey {

	Example(int a) {
		super(a);

	}

	final void call() {

	}

	final void call(int a) {

	}

	public final static void main(String[] args) {
		FinalKey f = new FinalKey(45);
		Example e = new Example(78);
	}
}
