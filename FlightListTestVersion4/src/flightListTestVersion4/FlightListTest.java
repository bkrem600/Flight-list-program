package flightListTestVersion4;

public class FlightListTest {

	public static void main(String[] args) {
		Integer flightListSize = Input.getInteger("flight list size: ");
		FlightList flights = new FlightList(flightListSize);
		
		String destination;
		Integer hours;
		Integer minutes;
		Integer option;
		
		do {
			System.out.println("0: quit");
			System.out.println("1: add flight");
			System.out.println("2: sort flights");
			System.out.println("3: display flights");
			
			option = Input.getInteger("option: ");
			
			switch (option) {
			case 0:
				System.out.println("Quitting program");
				break;
			case 1:
				destination = Input.getString("destination: ");
				hours = getValue("hours: ", 0, 23);
				minutes = getValue("minutes: ", 0, 59);
				flights.addFlight (destination, hours, minutes);
				break;
			case 2:
				flights.sort();
				break;
			case 3:
				System.out.println(flights);
				break;
			default:
				System.out.println("invalid option");
			}
			
		} while (option != 0);

	}
	
	private static Integer getValue (String prompt, Integer minimum, Integer maximum) {
		Integer value;
		Boolean valid = false;
		class ValueNotInRangeException extends Exception {
		}
		do {
			value = Input.getInteger(prompt);
			try {
				if (value < minimum || value > maximum)
					throw new ValueNotInRangeException();
				valid = true;
			}
			catch (ValueNotInRangeException e) {
				System.out.println(value + " outwith the range " + minimum + " to " + maximum);
			}
		} while (!valid);
		return value;
	}

}
