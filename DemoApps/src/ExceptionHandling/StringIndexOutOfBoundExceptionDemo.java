package ExceptionHandling;

public class StringIndexOutOfBoundExceptionDemo {
	
public static void main(String[] args) {
		
		System.out.println("Start");
		String name = "Balaji";
		try {
		System.out.println(name.charAt(6));
		}catch(StringIndexOutOfBoundsException e) {
			System.out.println(e.toString());
		}
		
		System.out.println("End");
		
		
	}

}
