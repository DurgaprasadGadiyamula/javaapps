package inheritance;

public class RegularEmployee extends Employee{
	
	private double bonus;
	private String benefits;
	
	public double getBonus() {
		return bonus;
	}
	
	public void setBonus(double bonus) {
		this.bonus = bonus;
	}
	
	public String getBenefits() {
		return benefits;
	}
	
	public void setBenefits(String benefits) {
		this.benefits = benefits;
	}
	
	public void displayRegularDetails() {
		System.out.println("----  Regular Employee Deatils ------");
		displayDetails();
		System.out.println("Bonus: " + bonus);
		System.out.println("Benefits: " + benefits);
	}
	
	


}
