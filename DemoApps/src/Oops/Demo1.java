package Oops;

public class Demo1 {
	
	public void sayHello() {
		System.out.println("Hello User !");
	}

	public void sayWelcome() {
		System.out.println("Welcome User !");
	}

	public static void main(String[] args) {

		Demo1 demo = new Demo1();
		demo.sayHello();
		demo.sayWelcome();
		
		demo.sayHello();
		demo.sayWelcome();

	}

}
