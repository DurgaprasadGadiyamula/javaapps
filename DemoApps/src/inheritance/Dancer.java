package inheritance;

public class Dancer extends person {
	
	private String Groupname;

	public String getGroupname() {
		return Groupname;
	}

	public void setGroupname(String groupname) {
		Groupname = groupname;
	}
	
	public void dancing() {
		System.out.println(getName()+ " can dance");
	}
	

}
