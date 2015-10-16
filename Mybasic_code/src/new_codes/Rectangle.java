package new_codes;

public class Rectangle {
	public float area(float width, float length) {
		float result = width * length;
		return result;
	}

	public static void main(String[] args) {
		Rectangle rect = new Rectangle();
		float output = rect.area(6.7f, 4.9f);
		System.out.println("output:" + output);
	}

}
