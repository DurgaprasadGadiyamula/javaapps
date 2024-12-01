package Oops;

public class Student {
	// properties

		int sid;
		String sname;
		double sfee;

		// actions
		void display() {
			System.out.println("Sid : " + sid);
			System.out.println("Sname : " + sname);
			System.out.println("Sfee  : " + sfee);
			System.out.println("------------------------");
		}

		public static void main(String[] args) {
			// ClassName ref = new ClassName();
	        
			// We created object for Student
			Student s1 = new Student();
			
			// initlizing variables
			s1.sid = 1001;
			s1.sname = "Balaji";
			s1.sfee = 25000.00;
			
			// Calling methods
			s1.display();
			
			
			Student s2 = new Student();
			s2.sid = 1002;
			s2.sname = "Vamsi";
			s2.sfee = 30000.00;
			
			s2.display();
			
			
			
			

		}

}
