package inheritance;

public class ContractEmployee extends Employee {
	
	private int contractDuration;
	private double hourlyRate;
	
	public int getContractDuration() {
		return contractDuration;
	}
	public void setContractDuration(int contractDuration) {
		this.contractDuration = contractDuration;
	}
	public double getHourlyRate() {
		return hourlyRate;
	}
	public void setHourlyRate(double hourlyRate) {
		this.hourlyRate = hourlyRate;
	}
	
	public void  displayContractDetails() {
		System.out.println("----  Contract Employee Deatils ------");
		displayDetails();
		System.out.println("Contract Duration: " + contractDuration);
		System.out.println("Hourly Rate: " + hourlyRate);
	}

	

}
