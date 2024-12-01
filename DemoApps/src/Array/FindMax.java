
package Array;

public class FindMax {
	
	public static void main(String[] args) {

		int arr[] = { 12, 40, 54, 66, 21, 26 };

		int max = arr[0];

		for (int i = 0; i < arr.length; i++) {
			if (max < arr[i]) {
				max = arr[i];
			}
		}
		
		System.out.println("Max : "+max);

	}

}
