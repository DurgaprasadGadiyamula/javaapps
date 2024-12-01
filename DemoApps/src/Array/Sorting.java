package Array;

public class Sorting {
	
	public static void main(String[] args) {

		int arr[] = { 23, 32, 12, 21, 65, 34 };

		for (int i = 0; i < arr.length; i++) {
			for (int j = i; j < arr.length; j++) {
				if (arr[i] > arr[j]) {
					int flag = arr[i];
					arr[i] = arr[j];
					arr[j] = flag;
				}
			}
		}
		
		
		
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
	}

}
