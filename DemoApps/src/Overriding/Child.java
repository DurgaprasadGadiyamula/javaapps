package Overriding;

public class Child extends Parent {
	void show()
    {
        System.out.println("Child's show()");
    }
	
	 public static void main(String[] args)
	    {
	        
	        Child obj2 = new Child();
	        obj2.show();
	    }

}
