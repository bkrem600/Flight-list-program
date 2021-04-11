package flightListTestVersion2;

public class FlightList {
	private Flight[] flights;
	private Integer numberOfFlights;
	
	public FlightList (Integer flightListSize) {
		this.flights = new Flight[flightListSize];
		this.numberOfFlights = 0;
	}
	
	public String toString() {
		String flightListDetails = new String();
		if (this.numberOfFlights != 0) {
			flightListDetails += String.format("%-20s%15s\n", "TIME", "DESTINATION");
			for (Integer flight = 0; flight < this.numberOfFlights; flight++)
				flightListDetails += this.flights[flight] + "\n";
		}
		else
			flightListDetails += "flight list is empty";
		return flightListDetails;
	}
	
	public void addFlight (String destination, Integer hours, Integer minutes) {
		this.flights[this.numberOfFlights] = new Flight (destination, hours, minutes);
		this.numberOfFlights++;
	}
}
