package flightListTestVersion3;

public class Flight {
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
		flightDetails += String.format("%25s", this.destination);
		return flightDetails;

	
}
	}

