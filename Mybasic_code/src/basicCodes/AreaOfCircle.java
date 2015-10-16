package basicCodes;

public class AreaOfCircle {

	public static void calculation(double radius) {
		double area = 3.14 * radius * radius;
		System.out.println("area::" + area);

	}

	public static void main(String[] args) {
		AreaOfCircle.calculation(8.3d);
	}
}
