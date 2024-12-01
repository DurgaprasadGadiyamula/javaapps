package Abstraction;

public class OuterClass1 {
	
	public class InnerClass1 {
		public void show() {
			System.out.println("This is Inner Class Method");
		}
	}

	public void display() {
		System.out.println("This is Outer Class Method");
	}

	public static void main(String[] args) {
		OuterClass1 oc = new OuterClass1();
		oc.display();

		InnerClass1 ic = oc.new InnerClass1();
		ic.show();
	}

}
