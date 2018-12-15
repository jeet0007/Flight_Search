

public class Passenger {
	String name;
	String dob;
	String id;
	
	
	public Passenger() {
		this.name = "UnNamed";
		this.id = "60xxxxx";
	}
	
	public Passenger(String name,String dob, String id) {
		this.name = name;
		this.dob = dob;
		this.id = id;
		
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

	
}
