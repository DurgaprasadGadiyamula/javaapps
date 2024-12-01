package ExceptionHandling;

public class ArthematicException {
	
	public static void main(String[] args) {
		System.out.println("Start");
		try {
		  System.out.println(10 / 0);
		}catch (ArithmeticException e) {
			System.out.println(e.toString());
		}
		System.out.println("End");
	}

}
