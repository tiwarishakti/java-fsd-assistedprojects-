package keyandcustom;

public class finallydemo {

	public static void main(String[] args) {
		int a = 45, b = 0, rs = 0;
		try {
			rs = a / b;
		} catch (ArithmeticException e) {
			System.out.println("\n\tError :" + e.getMessage());
		} finally {
			System.out.println("\n\t the result is:" + rs);
		}

	}
}
