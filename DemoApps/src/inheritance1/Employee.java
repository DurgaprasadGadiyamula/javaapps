package inheritance1;

public class Employee extends Person {
	
	int employeeId;
	 public Employee(String name, int employeeId) {
	 super(name);  
	 this.employeeId = employeeId;
	 }
	 
	 public void display() {
	 super.display(); 
	 System.out.println("Employee ID: " + employeeId);
	 }
}
