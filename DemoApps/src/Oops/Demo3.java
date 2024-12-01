package Oops;

public class Demo3 {
	
	public int getNum() {
		return 10;
	}

	public String getName() {
		return "Balaji";
	}

	public static void main(String[] args) {
		Demo3 demo3 = new Demo3();
		int num = demo3.getNum();
		String name = demo3.getName();
		System.out.println(num + " " + name);
		System.out.println(demo3.getNum() + " " + demo3.getName());

	}

}
