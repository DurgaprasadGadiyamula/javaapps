package Oops;

public class Employee {
	
	int eid;
	String ename;
	double esal;
	
	
	void display() {
		System.out.println(eid+" "+ename+" "+esal);
	}
	
	public static void main(String[] args) {
		Employee e1 = new Employee();
		e1.eid = 1001;
		e1.ename = "Ram";
		e1.esal = 30000.00;
		
		e1.display();
		
		
		Employee e2 = new Employee();
		e2.eid = 1002;
		e2.ename = "Harish";
		e2.esal = 50000.00;
		
		e2.display();
		
		
	}

}
