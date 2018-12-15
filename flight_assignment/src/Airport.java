

public class Airport {
	Flight[] flights;
	String name;
	

	
	public Airport(String name){
		flights = new Flight[8];
		this.name = name;
	}
	
	public void addFlight(Airport location,String airlines,String flightNumber, String departureTime, String arivalTime, double price,
			String date) {
		
		Flight flight = new Flight(location,airlines,flightNumber,departureTime,arivalTime,price,date);
		for (int i = 0; i < flights.length; i++) {
			if(flights[i]==null) {
				flights[i] = flight;
				break;
			}
		}
		
	}

	public void  printFlight() {
		System.out.format("%-20s%-13s%15s\t%-15s%-15s%10s", "Airlines", "Flight Number", "Date", "Timings", "Price"," Seats Available");
		System.out.println();
		for (int i = 0; i < flightCount(); i++) {
			if(flights[i]!=null) {
			System.out.println(i+1 +") "+ flights[i].toString());
			}
		}
	}
	
	public void flightsTo(String to) {
		for (int i = 0; i < flightCount(); i++) {
			if(flights[i].location.name.equalsIgnoreCase(to)) {
				System.out.println((i+1)+" "+flights[i].toString());
			}
		}
	}
	
	public int flightCount() {
		int temp = 0;
		for (int i = 0; i < flights.length; i++) {
			if(flights[i]!=null) {
				 temp++;
			}
		}
		
		return temp;
	}

	public Flight[] getFlights() {
		return flights;
	}

	public void setFlights(Flight[] flights) {
		this.flights = flights;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
}
