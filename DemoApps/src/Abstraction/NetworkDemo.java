package Abstraction;

public class NetworkDemo {
	
	public static void main(String[] args) {

		Network vi = new Network() {

			@Override
			public void sms() {
				System.out.println("Vi SMS");

			}

			@Override
			public void data() {
				System.out.println("VI Data");

			}
			
		};
		vi.sms();
		vi.data();

		Network jio = new Network() {

			@Override
			public void sms() {
				System.out.println("Jio SMS");

			}

			@Override
			public void data() {
				System.out.println("Jio Data");

			}
		};
		jio.sms();
		jio.data();

		Network airtel = new Network() {

			@Override
			public void sms() {
				System.out.println("Airtel SMS");

			}

			@Override
			public void data() {
				System.out.println("Airtel Data");
			}
		};

		airtel.sms();
		airtel.data();

	}

}
