package ExceptionHandling;

public class ArrayIndexOutOfBoundExceptionDemo {
	
public static void main(String[] args) {
		
		System.out.println("Start");
		int arr[] = {2,3,4,5,6,7};
		try {
		System.out.println(arr[5]);
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println(e.toString());
		}
		
		System.out.println("End");
		
		
	}

}
