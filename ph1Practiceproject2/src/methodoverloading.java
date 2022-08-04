
public class methodoverloading {

	public void area(int b, int h) {
		System.out.println("Area of triangle: " + (0.5 * b * h));
	}

	public void area(int r) {
		System.out.println("Area of Circle: " + (3.14 * r * r));
	}

	

	public static void main(String[] args) {
		methodoverloading obj = new methodoverloading();
		obj.area(10, 12);
		obj.area(5);
	}
}
