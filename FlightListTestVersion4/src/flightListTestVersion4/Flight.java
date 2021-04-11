package flightListTestVersion4;

public class Flight implements Comparable<Flight> {
	protected String destination;
	protected Integer hours;
	protected Integer minutes;
	
	public Flight(String destination, Integer hours, Integer minutes) {
		this.destination = destination;
		this.hours = hours;
		this.minutes = minutes;
	}

	public String toString() {
		String flightDetails = new String();
		if (hours < 10 || minutes < 10) {
			flightDetails += String.format("%02d", this.hours) + ":";
			flightDetails += String.format("%02d", this.minutes);
	} 	else {
			flightDetails += String.format("%2d", this.hours) + ":";
			flightDetails += String.format("%2d", this.minutes);
	}
		flightDetails += String.format("%30s", this.destination);
		return flightDetails;

	
}

	@Override
	public int compareTo(Flight flight) {
		Integer result = this.hours.compareTo(flight.hours);
		if (result == 0) {
			result = this.minutes.compareTo(flight.minutes);
		}
		if (result == 0) {
			result = this.destination.compareTo(flight.destination);
		}
		return result;
	}
	}

