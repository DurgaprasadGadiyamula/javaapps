package inheritance;

public class Main {
	
	public static void main(String[] args){
		
		person p = new person();
		p.setName("Durgaprasad");
		p.setDesignation("SE");
		p.eat();
		p.learn();
		p.walk();
		
		System.out.println("-------------------------------------------");
		
		Programmer programmer = new Programmer();
		programmer.setName("Harsha");
		programmer.setDesignation("Devloper");
		programmer.setCompanyname("TCS");
		programmer.eat();
		programmer.learn();
		programmer.walk();
		programmer.Coding();
		
		System.out.println("------------------------------");
		
		Dancer dancer = new Dancer();
		dancer.setName("Vamsi");
		dancer.setDesignation("Vamsi");
		dancer.setGroupname("ABC");
		dancer.eat();
		dancer.learn();
		dancer.walk();
		dancer.dancing();
		
	}

}
