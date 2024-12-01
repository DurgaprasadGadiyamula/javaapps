package inheritance;

public class Programmer extends person {
	
	private String Companyname;
	
	public String getCompanyname() {
		return Companyname;
	}

	public void setCompanyname(String companyname) {
		this.Companyname = companyname;
	}
	
public void Coding() {
	System.out.println(getName()+" can Code");
	
}
	

}
