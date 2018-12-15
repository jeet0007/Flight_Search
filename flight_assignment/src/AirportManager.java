

import java.util.Scanner;

public class AirportManager {

	Airport[] airports;
	Airport myLocation;

	public AirportManager() {
		airports = new Airport[15];

		Airport bangkok = new Airport("Bangkok");
		Airport india = new Airport("India");
		Airport beijing = new Airport("Beijing");
		Airport newYork = new Airport("New York");
		Airport madrid = new Airport("Madrid");
		Airport moscow = new Airport("Moscow");
		Airport tokyo = new Airport("Tokyo");
		Airport kualaLumpur = new Airport("Kuala Lumpur");
		Airport hongKong = new Airport("Hong Kong");
		Airport seoul = new Airport("Seoul");
		
		
		
		airports[0] = bangkok;
		airports[1] = india;
		airports[2] = beijing;
		airports[3] = newYork;
		airports[4] = madrid;
		airports[5] = tokyo;
		airports[6] = kualaLumpur;
		airports[7] = hongKong;
		airports[8] = seoul;
		
		
		bangkok.addFlight(india, "Etihad Airways", "PG4847", "10:10", "15:50", 9721.72, "19/04/2019");
		bangkok.addFlight(beijing, "Thai Airways", "PG7243", "01:30", "07:00", 9287.65, "19/04/2019");
		bangkok.addFlight(newYork, "Etihad Airline", "EY101", "06:05", "03:55", 22019.58, "19/04/2019");
		bangkok.addFlight(seoul, "Thai Airways", "TG1667", "10:30", "15:55", 6400.75, "20/04/2019");
		bangkok.addFlight(kualaLumpur, "Thai Airways", "TG1880", "03:00", "05:25", 4760, "20/04/2019");
		bangkok.addFlight(tokyo, "Thai Airway", "EK4351", "13:00", "19:00", 3600.56, "21/04/2019");
		bangkok.addFlight(hongKong, "Bangkok Airways", "PG8894", "19:00", "21:45", 2300.17, "21/04/2019");
		bangkok.addFlight(madrid, "Emirate", "EK1593", "23:10", "15:45", 12060.22, "21/04/2019");
		
		
		india.addFlight(bangkok, "Thai airways", "AI332", "13:45", "19:20", 13400.00, "19/04/2019");
		india.addFlight(madrid, "Bangkok Airways", "PG7243", "01:30", "07:00", 9287.65, "19/04/2019");
		india.addFlight(newYork, "Etihad Airways", "EY101", "06:05", "03:55", 22019.58, "19/04/2019");
		india.addFlight(beijing, "Etihad Airline", "EY7757", "05:00", "10:45", 6380 ,"20/04/2019");
		india.addFlight(seoul, "Emirate", "EK6659", "20:30", "03:15", 15360,"21/04/2019");
		india.addFlight(tokyo, "Japan Airlines", "JL7798", "06:45", "13:30", 9600.53, "21/04/2019");
		india.addFlight(kualaLumpur, "Emirate", "EK5566", "04:45", "10:30", 7800, "21/04/2019");
		
		beijing.addFlight(india, "Etihad Airways", "PG4847", "10:10", "15:50", 9721.72, "19/04/2019");
		beijing.addFlight(bangkok, "Bangkok Airways", "PG7243", "01:30", "07:00", 9287.65, "19/04/2019");
		beijing.addFlight(kualaLumpur, "Air China", "CA101", "06:05", "03:55", 8400.58, "19/04/2019");
		beijing.addFlight(seoul, "Air China", "CA964", "10:00", "12:00", 3800, "20/04/2019");
		beijing.addFlight(tokyo, "Air China", "CA5563", "15:30", "18:50", 4500, "20/04/2019");
		beijing.addFlight(bangkok, "Thai Airways", "TG7413", "13:20", "18:40", 6000, "20/04/2019");
		beijing.addFlight(hongKong, "Air China", "CA413", "19:50", "23:30", 6800, "20/04/2019");
		beijing.addFlight(moscow, "Aeroflot", "SU4512", "16:20", "00:35", 13500, "21/04/2019");
		beijing.addFlight(bangkok, "Thai Airways", "TG7414", "18:00", "0:30", 8400, "21/04/2019");
		beijing.addFlight(madrid, "Iberia", "IB8643", "11:00", "22:45", 17000, "21/04/2019");
		
		
		hongKong.addFlight(india, "Etihad Airways", "PG4847", "10:10", "15:50", 9721.72, "19/04/2019");
		hongKong.addFlight(bangkok, "Cathay Pacific", "CX7243", "01:30", "7:00", 9287.65, "19/04/2019");
		hongKong.addFlight(beijing, "Air China", "CA5574", "07:00", "10:40", 4800, "19/04/2019");
		hongKong.addFlight(bangkok, "Thai Airways", "TG477", "13:00", "19:30", 7500, "20/04/2019");
		hongKong.addFlight(seoul, "Cathay Pacific", "CX8526", "05:40", "09:30", 6500, "20/04/2019");
		hongKong.addFlight(moscow, "Emirate", "EK984", "19:05", "05:25", 12600, "21/04/2019");
		hongKong.addFlight(kualaLumpur, "Cathay Pacific", "CX4495", "19:00", "23:00", 6400, "21/04/2019");
		hongKong.addFlight(tokyo, "Japan Airlines", "JL7673", "16:00", "20:00", 5400.63, "21/04/2019");

		
		seoul.addFlight(madrid, "Bangkok Airways", "PG4847", "10:10", "15:50", 9721.72, "19/04/2019");
		seoul.addFlight(kualaLumpur, "Bangkok Airways", "PG7243", "01:30", "07:00", 9287.65, "19/04/2019");
		seoul.addFlight(newYork, "Etihad Airways", "EY101", "06:05", "03:55", 22019.58, "19/04/2019");
		seoul.addFlight(beijing, "Air China", "CA5563", "15:00", "17:00", 3700, "20/04/2019");
		seoul.addFlight(hongKong, "Cathay Pacific", "CX8526", "08:00", "12:20", 6400, "20/04/2019");
		seoul.addFlight(bangkok, "Thai Airways", "TG1667", "06:00", "11:25", 6400, "20/04/2019");
		seoul.addFlight(india, "Emirate", "EK6659", "20:30", "03:15", 15360, "20/04/2019");
		seoul.addFlight(tokyo, "Japan Airlines", "JL656", "08:20", "10:35", 3600, "21/04/2019");
		seoul.addFlight(madrid, "Emirate", "EK777", "10:20", "00:00", 15600, "21/04/2019");
			
		
		tokyo.addFlight(bangkok, "Thai airways", "TG332", "13:45", "19:20", 13400.00, "19/04/2019");
		tokyo.addFlight(beijing, "Bangkok Airways", "PG7243", "01:30", "07:00", 9287.65, "19/04/2019");
		tokyo.addFlight(newYork, "Etihad Airways", "EY101", "06:05", "03:55", 22019.58, "19/04/2019");
		tokyo.addFlight(seoul, "Japan Airlines", "JL656", "08:20", "10:35", 3600, "20/04/2019");
		tokyo.addFlight(hongKong, "Japan Airlines", "JL7673", "12:00", "16:00", 5400.32, "20/04/2019");
		tokyo.addFlight(india, "Japan Airlines", "JL7798", "03:00", "09:45", 9400, "20/04/2019");
		tokyo.addFlight(beijing, "Air China", "CA5563", "15:00", "18:20", 4500, "21/04/2019");
		tokyo.addFlight(kualaLumpur, "Japan Airlines", "JL7711", "08:00", "15:50", 8700.12, "21/04/2019");
		tokyo.addFlight(newYork, "Delta Airlines", "DL667", "10:00", "00:20", 18000, "21/04/2019");
		
		
		kualaLumpur.addFlight(india, "Bangkok Airways", "PG4847", "10:10", "15:50", 9721.72, "19/04/2019");
		kualaLumpur.addFlight(bangkok, "Bangkok Airways", "PG7243", "01:30", "7:00", 9287.65, "19/04/2019");
		kualaLumpur.addFlight(newYork, "Etihad Airways", "EY101", "06:05", "3:55", 22019.58, "19/04/2019");
		kualaLumpur.addFlight(tokyo, "Japan Airlines", "JL7711", "09:00", "16:50", 8600.36, "20/04/2019");
		kualaLumpur.addFlight(seoul, "Cathay Pacific", "CX2218", "11:00", "17:45", 7840, "20/04/2019");
		kualaLumpur.addFlight(beijing, "Air China", "CA101", "12:00", "18:20", 8300.66, "20/04/2019");
		kualaLumpur.addFlight(bangkok, "Thai Airways", "TG1880", "15:20", "17:45", 4300.55, "21/04/2019");
		kualaLumpur.addFlight(hongKong, "Cathay Pacific", "CX4495", "06:00", "10:00", 6500, "21/04/2019");
		
		
		madrid.addFlight(india, "Etihad Airways", "EY4847", "10:10", "15:50", 9721.72, "19/04/2019");
		madrid.addFlight(beijing, "Bangkok Airways", "PG7243", "01:30", "7:00", 9287.65, "19/04/2019");
		madrid.addFlight(newYork, "Emirate", "EK101", "06:05", "3:55", 22019.58, "19/04/2019");
		madrid.addFlight(moscow, "Emirate", "EK7789", "12:00", "17:00", 6800.87, "20/04/2019");
		madrid.addFlight(seoul, "Emirate", "EK777", "10:20", "00:00", 15000.33, "20/04/2019");
		madrid.addFlight(newYork, "Iberia", "IB446", "00:00", "07:10", 12800, "20/04/2019");
		madrid.addFlight(beijing, "Iberia", "IB8643", "10:00", "21:45", 16000, "21/04/2019");
		madrid.addFlight(tokyo, "Japan Airlines", "JL6633", "13:00", "02:45", 19600, "21/04/2019");
		
		
		newYork.addFlight(india, "Etihad Airways", "EY4847", "10:10", "15:50", 9721.72, "19/04/2019");
		newYork.addFlight(madrid, "Iberia", "IB6443", "06:00", "13:10", 12800, "19/04/2019");
		newYork.addFlight(hongKong, "Cathay Pacific", "CX101", "6:05", "3:55", 22019.58, "20/04/2019");
		newYork.addFlight(tokyo, "Delta Airlines", "DL433", "06:30", "20:50", 18900, "20/04/2019");
		newYork.addFlight(beijing, "China Air", "CA7243", "1:30", "7:00", 9287.65, "21/04/2019");
		
		
	}

	public Airport getMyLocation() {
		return myLocation;
	}

	public void setLocation(String location) {

		for (int i = 0; i < airports.length; i++) {
			if (airports[i].name.equalsIgnoreCase(location)) {
				this.myLocation = airports[i];
				break;
			}
		}

	}

	public void printto(String to) {

		myLocation.flightsTo(to);

	}

	public void book(Scanner scan) {
		System.out.print("TO: ");
		String to = scan.nextLine();
		this.printto(to);

		System.out.print("Enter the number to choose the flight : ");
		String temo = scan.nextLine();
		int choise = Integer.parseInt(temo) - 1;
			
		System.out.print("Full Name: ");
		String name = scan.nextLine();
		System.out.print("Enter your National id or Passport Number ");
		String id = scan.nextLine();
		System.out.print("Enter your Date of Birth(D/M/Y): ");
		String dob = scan.nextLine();
		Passenger n = new Passenger(name, dob, id);

		if (myLocation.flights[choise].book(n)) {
			System.out.println("Your Flight has successfully been booked have a nice day.");
		} else {
			System.out.print("Sorry no more seats left on the flight");
		}
	}

	
	public void checkFlight(Scanner scan) {
		System.out.print("Please enter your Full name: ");
		String name = scan.nextLine();
		
		Flight[] flights = this.myLocation.flights;

		for (int i = 0; i < this.myLocation.flightCount(); i++) {
			if(flights[i].findPassenger(name)) {
				System.out.println(flights[i].toString());
			}
		}
	}

}
