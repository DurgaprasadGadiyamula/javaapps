package Oops;

public class MathUtil1 {
	public void findRev(int num) {
		int rev = 0;
		while (num > 0) {
			int rem = num % 10;
			rev = rev * 10 + rem;
			num = num / 10;
		}

		System.out.println("Rev val : " + rev);
	}

	public void checkPrime(int num) {
		int count = 0;
		for (int i = 2; i < (num / 2 + 1); i++) {
			if (num % i == 0) {
				count++;
			}
		}

		if (count == 0) {
			System.out.println("Prime");
		} else {
			System.out.println("Not Prime");
		}
	}

	public int fact(int num) {
		int fact = 1;
		for (int i = 1; i <= num; i++) {
			fact *= i;
		}
		return fact;
	}

	public void printFenocci(int num) {

		int a = 0;
		int b = 1;

		System.out.print(a + " " + b + " ");

		for (int i = 3; i <= num; i++) {
			int next = a + b;
			System.out.print(next + " ");
			a = b;
			b = next;
		}
	}

	public int sumOfNumbers(int num) {
		return num * (num + 1) / 2;
	}

	public static void main(String[] args) {
		MathUtil mathUtil = new MathUtil();
		mathUtil.findRev(567);
		mathUtil.findRev(967);
		mathUtil.findRev(9997);
		mathUtil.findRev(65247);
		mathUtil.findRev(567899);

		mathUtil.checkPrime(23);
		mathUtil.checkPrime(19);
		mathUtil.checkPrime(2);

		System.out.println("5 fact : " + mathUtil.fact(5));
		System.out.println("15 fact : " + mathUtil.fact(15));
	}

}
