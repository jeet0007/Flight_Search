

public class Passenger {
	String name;
	String dob;
	String id;
	Flight[] bookings;
	
	
	public Passenger() {
		this.name = "UnNamed";
		this.id = "60xxxxx";
		this.bookings = new Flight[10];
	}
	
	public Passenger(String name,String dob, String id) {
		this.name = name;
		this.dob = dob;
		this.id = id;
		this.bookings = new Flight[10];
		
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	@Override
	public String toString() {
		return "Name: "+name+"\nID: "+id;
	}
	
	public boolean addFlight(Flight flight) {
		
		for (int i = 0; i < bookings.length; i++) {
			if(bookings[i]==null) {
				bookings[i] = flight;
				
				return true;
			}
		}
		return false;
	}
	
	public void printBookings() {
		for (int i = 0; i < bookings.length; i++) {
			if (bookings[i] != null) {
				System.out.println(bookings[i].toString());
			}
		}
	}


}
