package inheritance;

public class Main1 {
	
	public static void main(String[] args) {
		
		ContractEmployee contractEmployee = new ContractEmployee();
		contractEmployee.setId(01);
		contractEmployee.setName("Durgaprasad");
		contractEmployee.setSalary(10000);
		contractEmployee.setContractDuration(24);
		contractEmployee.setHourlyRate(1000);
		contractEmployee.displayContractDetails();
		contractEmployee.work();
		
		
		RegularEmployee regularEmployee = new RegularEmployee();
		regularEmployee.setId(02);
		regularEmployee.setName("Harinadh");
		regularEmployee.setSalary(10000);
		regularEmployee.setBonus(120000);
		regularEmployee.setBenefits("CAB,FOOD,HealthInsurance");
		regularEmployee.displayRegularDetails();
		regularEmployee.work();
	}
	
	

}
