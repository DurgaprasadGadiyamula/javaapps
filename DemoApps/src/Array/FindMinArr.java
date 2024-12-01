package Array;

public class FindMinArr {
	
	public static void main(String[] args) {
		int arr[] = { 12, 40, 54, 5, 66, 21, 26 };

		int min = arr[0];
		
		for (int i = 0; i < arr.length; i++) {
			if(min > arr[i]) {
				min = arr[i];
			}
		}
		
		System.out.println("Min : "+min);
		
	}


}
