package flight_Assignment;


public class Flight {
	Airport location;
	String airlines;
	String flightNumber;
	String departureTime;
	String arivalTime;
	int numOfSeats;
	Passenger[] passengerList;
	double price;
	String date;

	public Flight(Airport location, String airlines, String flightNumber, String departureTime, String arivalTime,
			double price, String date) {
		this.location = location;
		this.airlines = airlines;
		this.flightNumber = flightNumber;
		this.departureTime = departureTime;
		this.arivalTime = arivalTime;
		this.numOfSeats = 300;
		this.price = price;
		this.passengerList = new Passenger[numOfSeats];
		this.date = date;
	}

	public boolean book(Passenger passenger) {
		if (numOfSeats > 0) {
			numOfSeats--;
			addPassenger(passenger);
			return true;
		} else {
			return false;
		}
	}

	@Override
	public String toString() {
		return String.format("%-10s%-10s%10s\t%s-->%s%10.2f฿%10d", airlines, flightNumber, date, departureTime,
				arivalTime, price, numOfSeats);

	}

	public Passenger[] getPassengerList() {
		return passengerList;
	}

	private void addPassenger(Passenger passenger) {
		for (int i = 0; i < passengerList.length; i++) {
			if (passengerList[i] == null) {
				passengerList[i] = passenger;
			}

		}
	}

	public boolean findPassenger(String name) {
		for (int i = 0; i < passengerList.length; i++) {
			if (passengerList[i] != null) {
				if (passengerList[i].name.equals(name)) {
					return true;
				}
			}
		}
		return false;
	}

	public Airport getLocation() {
		return location;
	}

	public void setLocation(Airport location) {
		this.location = location;
	}
	
}
