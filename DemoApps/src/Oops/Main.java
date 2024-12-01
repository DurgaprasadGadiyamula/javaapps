package Oops;

public class Main {
	public static void main(String[] args) {
		Doctor d1 = new Doctor();
		Doctor d2 = new Doctor(1,"Durgaprasad",21);
		
		System.out.println("d1 :");
		d1.DisplayDoctorDetails();
		
		System.out.println(" d2 :");
		d2.DisplayDoctorDetails();
		
		d1.setDid(12);
		d1.setDname("Harinadh");
		d1.setDexp(21);
		
		System.out.println("d1 :");
		d1.DisplayDoctorDetails();
	}

}
