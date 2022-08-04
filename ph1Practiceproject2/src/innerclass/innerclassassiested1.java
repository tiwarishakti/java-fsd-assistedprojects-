package innerclass;

public class innerclassassiested1 {

	 private String msg="Welcome to Java"; 
	 
	 class Inner{  
	  void hello(){System.out.println(msg+", Let us start learning Inner Classes");}  
	 }  


	public static void main(String[] args) {

		innerclassassiested1 obj=new innerclassassiested1();
		innerclassassiested1.Inner in=obj.new Inner();  
		in.hello();  
	}
}

