package basicCodes;

public class SquareArea {
	public static float calci(float side) {
		float area = side * side;
		System.out.println("area::" + area);
		return area;

	}

	public static void main(String[] args) {
		SquareArea area=new SquareArea();
		area.calci(6.78f);
	}

}
