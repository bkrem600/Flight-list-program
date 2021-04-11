package flightListTestVersion2;


public class FlightListTest {

	public static void main(String[] args) {
		Integer flightListSize = Input.getInteger("flight list size: ");
		FlightList flight = new FlightList(flightListSize);
		
		String destination;
		Integer hours;
		Integer minutes;
		Integer option;
		
		do {
			System.out.println("0: quit");
			System.out.println("1: add flight");
			System.out.println("2: display flights");
			
			option = Input.getInteger("option: ");
			
			switch (option) {
			case 0:
				System.out.println("Quitting program");
				break;
			case 1:
				destination = Input.getString("destination: ");
				hours = Input.getInteger("hours: ");
				minutes = Input.getInteger("minutes: ");
				flight.addFlight(destination, hours, minutes);
				break;
			case 2:
				System.out.println(flight);
				break;
			default:
				System.out.println("invalid option");
			}
			
		} while (option != 0);

	}

}
