package flightListTestVersion1;

public class Flight {
	protected String destination;
	protected Integer hours;
	protected Integer minutes;
	
	public Flight (String destination, Integer hours, Integer minutes) {
		this.destination = destination;
		this.hours = hours;
		this.minutes = minutes;
	}
	
	public String toString() {
		String flightDetails = new String();
		if (this.hours < 10 || this.minutes < 10) {
			flightDetails += String.format("%02d", this.hours) + ":";
			flightDetails += String.format("%02d", this.minutes);
			flightDetails += " " + this.destination;
		} else
		flightDetails += this.hours + ":" + this.minutes + " " + this.destination;
		return flightDetails;
		
	}

}
