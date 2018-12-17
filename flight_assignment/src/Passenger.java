

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
		
		for (Flight x : this.bookings) {
			if(x==null) {
				x = flight;
				return true;
			}else {
				System.out.println();
			}
			
			
		}
		return false;
	}
	
	public void printBookings() {
		for (Flight flight : bookings) {
			flight.toString();
		}
	}


}
