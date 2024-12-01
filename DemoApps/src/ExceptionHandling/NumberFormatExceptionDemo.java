package ExceptionHandling;

public class NumberFormatExceptionDemo {
	
	public static void main(String[] args) {

		System.out.println("Start");
		String data = "balaji";
		try {
			int num = Integer.parseInt(data);
			System.out.println(num);

		} catch (NumberFormatException e) {
			System.out.println(e.toString());
		}

		System.out.println("End");

	}


}
