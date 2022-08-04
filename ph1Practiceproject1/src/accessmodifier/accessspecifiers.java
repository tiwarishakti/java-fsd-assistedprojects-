package accessmodifier;

class defAccessSpecifier{
	void display() {
		System.out.println("you are using default access specifier");
	}
}

public class accessspecifiers {
	public static void main(String[] args) {
		System.out.println("Default Access Specifier");
		defAccessSpecifier obj = new defAccessSpecifier();
		obj.display();
	}
}
