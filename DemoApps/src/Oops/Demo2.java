package Oops;

public class Demo2 {
	
	public void sayHello(String name) {
		System.out.println("Hello " + name + " !");
	}
	
	public static void main(String[] args) {
		Demo2 demo2 = new Demo2();
		demo2.sayHello("Balaji");
		demo2.sayHello("Raja");
		demo2.sayHello("Harish");
	}

}
