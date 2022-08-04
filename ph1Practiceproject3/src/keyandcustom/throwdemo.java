package keyandcustom;

public class throwdemo {
	public static void main(String[] args) {
		int a = 45, b = 0, rs;
		try {
			if (b == 0)
				throw (new ArithmeticException("can't divide by zero."));
			else {
				rs = a / b;
				System.out.println("\n\tThe result is:" + rs);
			}
		} catch (ArithmeticException Ex) {
			System.out.println("\n\tError :" + Ex.getMessage());
		}
		System.out.println("\n\tEnd of program.");
	}
}
