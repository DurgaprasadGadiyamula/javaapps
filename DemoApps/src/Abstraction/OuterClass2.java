package Abstraction;

public class OuterClass2 {

	public static class InnerClass2{
		public void display() {
			System.out.println("I am static Inner class");
		}
	}
	
	
	public static void main(String[] args) {
		InnerClass2 ic = new OuterClass2.InnerClass2();
		ic.display();
	}
}
