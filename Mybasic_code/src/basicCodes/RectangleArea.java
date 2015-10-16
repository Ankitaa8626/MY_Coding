package basicCodes;

public class RectangleArea {
	public static void cal(float lenght, float height) {
		float area = lenght * height;
		System.out.println("area:" + area);

	}

	public static void main(String[] args) {
		RectangleArea.cal(4.5f, 8.9f);
	}

}
