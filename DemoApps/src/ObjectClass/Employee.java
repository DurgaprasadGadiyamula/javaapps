package ObjectClass;

import java.util.Objects;

public class Employee {
	
	int id; 
	String name; 
	
	public Employee(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	
	
	
	


//	@Override
//	public boolean equals(Object obj) {
//		if (this == obj)
//			return true;
//		if (obj == null)
//			return false;
//		if (getClass() != obj.getClass())
//			return false;
//		Employee other = (Employee) obj;
//		return id == other.id && Objects.equals(name, other.name);
//	}



	@Override
	public int hashCode() {
		return Objects.hash(id, name);
	}




	public static void main(String[] args) {
		Employee e1 = new Employee(1, "Balaji");
		Employee e2 = new Employee(1, "Balaji");
		System.out.println("return the value :"+e1.equals(e2));
	}
	
	
}
