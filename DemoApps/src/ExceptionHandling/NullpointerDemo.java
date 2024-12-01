package ExceptionHandling;

public class NullpointerDemo {

	public static void main(String[] args) {
		System.out.println("Start");
		String name = "Durga";
		try {
		System.out.println("Length : "+name.length());
		}catch (NullPointerException e) {
			System.out.println(e.toString());
		}
		System.out.println("End");
	}
}
