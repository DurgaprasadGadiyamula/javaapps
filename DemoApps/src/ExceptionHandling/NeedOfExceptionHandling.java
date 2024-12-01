package ExceptionHandling;

public class NeedOfExceptionHandling {
	
	public static void main(String[] args) {
		
		System.out.println("start");
		System.out.println("start");
		System.out.println("start");
		try {
		System.out.println(10/0);
		}catch(ArithmeticException e) {
			System.out.println(e.toString());
		}
		System.out.println("start");
		System.out.println("start");
		System.out.println("start");
		System.out.println("start");
		System.out.println("start");
		System.out.println("end");
	}

}
