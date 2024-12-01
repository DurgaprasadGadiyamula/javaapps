package Oops;

public class Car {
	String color;
	String model;
	String brand;

	public Car() {

	}

	public Car(String carColor, String carModel, String carBrand) {
		color = carColor;
		model = carModel;
		brand = carBrand;
	}

	public Car(String carColor) {
		color = carColor;
	}

	public Car(String carColor, String carModel) {
		color = carColor;
		model = carModel;
	}

	void display() {
		System.out.println("Color : " + color);
		System.out.println("Model : " + model);
		System.out.println("Brand : " + brand);
	}

	void drive() {
		System.out.println("The car is driving");
	}

	void changeGear() {
		System.out.println("Changing Gear");
	}

	public static void main(String[] args) {

		Car car1 = new Car("Red");
		car1.display();

		System.out.println("---------------------------");

		Car car2 = new Car("Red", "XUV", "TATA");
		car2.display();
		
		System.out.println("---------------------------");
		Car car3 = new Car("Green", "SUV");
		car3.display();

	}

}
