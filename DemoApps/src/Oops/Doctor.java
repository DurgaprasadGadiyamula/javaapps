package Oops;

public class Doctor {
	
	private int did;
	private String dname;
	private int dexp;
	
	//Default Constructors
	public Doctor() {
		
	}
	//Parameterized constructors
	public Doctor(int did , String dname , int dexp){
		
	this.did = did;
	this.dname = dname;
	this.dexp = dexp;
	
	}
	
	//setters and getters 
	public int getDid() {
		return did;
	}
	public void setDid(int did) {
		this.did = did;
	}

	public String getDname() {
		return dname;
	}
	public void setDname(String dname) {
		this.dname = dname;
	}
	
	public int getDexp() {
		return dexp;
	}
	public void setDexp(int dexp) {
		this.dexp = dexp;
	}
	
	public void DisplayDoctorDetails() {
		System.out.println(" Doctor ID :" + did);
		System.out.println(" Doctor Name :" + dname);
		System.out.println(" Doctor Exp :" + dexp);
	}
}
