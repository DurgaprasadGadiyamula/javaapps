package Abstraction;

public class OuterClass3 {
	
public void show() {
		
		class InnerClass3{
			public void display() {
				System.out.println("I am local Inner class");
			}
		}
		
		InnerClass3 ic = new InnerClass3();
		ic.display();
		
	}
	
	
	public static void main(String[] args) {
		OuterClass3 outerClass3 = new OuterClass3();
		outerClass3.show();
	}

}
