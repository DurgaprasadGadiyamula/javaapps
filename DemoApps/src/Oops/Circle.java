package Oops;

public class Circle {

		int radius;

		void area() {
			double area = Math.PI * radius * radius;
			System.out.println("Aria of Circle is : " + area);
		}

		void perimeter() {
			double pm = 2 * Math.PI * radius;
			System.out.println("Perimeter of Circle is : " + pm);
		}
		
		public static void main(String[] args) {
			Circle c1 = new Circle();
			c1.radius = 10;
			c1.area();
			c1.perimeter();
			
			Circle c2 =new Circle();
			c2.radius = 12;
			c2.area();
			c2.perimeter();
		}

	}

