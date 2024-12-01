package Array;

public class AveEleArr {
	
	public static void main(String[] args) {
		int arr[] = { 12, 40, 54, 66, 21, 26 };
		int sum = 0;
		for (int i = 0; i < arr.length; i++) {
			sum = sum + arr[i];
		}
		System.out.println("Sum : " + sum);
		int avg = sum / arr.length;
		System.out.println("Avg : " + avg);
	}

}
