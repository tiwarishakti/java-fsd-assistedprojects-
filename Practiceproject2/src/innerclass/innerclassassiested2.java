package innerclass;

public class innerclassassiested2 {

private String msg="Inner Classes";

 void display(){  
	 class Inner{  
		 void msg(){
			 System.out.println(msg);
		 }  
  }  
  
  Inner l=new Inner();  
  l.msg();  
 }  

 
public static void main(String[] args) {
	innerclassassiested2  ob=new innerclassassiested2 ();  
	ob.display();  
	}
}

