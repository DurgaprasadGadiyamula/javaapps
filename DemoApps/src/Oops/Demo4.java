package Oops;

public class Demo4 {
	public int sum(int a, int b) {
		return a + b;
	}
	
	public String fullName(String fname,String lname) {
		return fname+" "+lname;
	}
	
	public int getStrLength(String str) {
		return str.length();
	}

	public static void main(String[] args) {
		Demo4 demo4 = new Demo4();
//		System.out.println("Sum : "+demo4.sum(10, 20));

		int result = demo4.sum(10, 20);
		System.out.println("Result : " + result);
		
		String name = demo4.fullName("Balaji", "G");
		System.out.println("Name : "+name);
		
		System.out.println("Str Length "+demo4.getStrLength("Balaji"));
	}

}
