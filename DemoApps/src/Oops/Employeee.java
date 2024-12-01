package Oops;

public class Employeee {
	int eid;
	String ename;
	double esal;
	
	public Employeee(int eid, String ename, double esal) {
		this.eid = eid;
		this.ename = ename;
		this.esal = esal;
	}
	
	public Employeee() {
		
	}
	
	void display() {
		System.out.println(eid+" "+ename+" "+esal);
	}
	
	public static void main(String[] args) {
		
		Employeee e1 = new Employeee(1,"Balaji",20000.00);
		e1.display();
		
		
		System.out.println("--------------------");
		
		Employeee e2 = new Employeee();
		e2.display();
		
	System.out.println("--------------------");
		
		Employeee e3 = new Employeee();
		e3.display();
	}


}
