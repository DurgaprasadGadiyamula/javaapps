package Operators;

public class AssignmentOperators {
	public static void main(String[] args) {
		int a = 10;
		int b = a;
		System.out.println("b :"+b);
		
		b += 5;
		System.out.println("b += 5 :"+b);
		b -= 5;
		System.out.println("b -= 5 :"+b);
		b *= 2;
		System.out.println("b *= 2 :"+b);
		b /= 2;
		System.out.println("b /= 2 :"+b);
		b %= 5;
		System.out.println("b %= 5 :"+b);
	}

}
