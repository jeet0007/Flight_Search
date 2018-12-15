package flight_Assignment;

import java.util.Scanner;

public class Booking {
	public static void main(String[] args) throws Exception{
		AirportManager expedia = new AirportManager();
		Scanner scan = new Scanner(System.in);
		String myLocation = "";
		System.out.print("Please enter your origin: ");
		
		myLocation = scan.nextLine();
		expedia.setLocation(myLocation);

		System.out.println("----------Welcome to Utopia.com----------\nHow may we help you today.\n"
				+ "Press 1) To Book a flight\n" + "Press 2) To check booking details\n"
				+ "Press 3) To View All Flight\n" + "Press 4) To Exit ");

		String service = "";
		
		while (!service.equals("4")) {

			service = scan.nextLine();

			switch (service) {
			case "1": {
				expedia.book(scan);
				break;
			}
			case "2": {
				expedia.checkFlight(scan);
				break;
			}
			case "3": {
				expedia.myLocation.printFlight();
				break;
			}
			default: {
				break;
			}

			}
		}
		scan.close();
		System.out.println("Thank you and have a nice day");
	}

}
