package excephandler;

class MyException extends Exception {
	String s1;

	MyException(String s2) {
		s1 = s2;
	}

	public String toString() {
		return ("MyException occurred: " + s1);
	}
}

public class demo {

	public static void main(String[] args) {

		try {
			System.out.println("Starting of try block");
			throw new MyException("This is My error message");
		} catch (MyException e) {
			System.out.println("Catch block");
			System.out.println(e);
		}

	}

}
