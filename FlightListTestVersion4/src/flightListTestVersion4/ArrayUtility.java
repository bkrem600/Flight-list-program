package flightListTestVersion4;

public class ArrayUtility {
	public static void display (Object[] values) {
		for (Object value: values) {
			System.out.println(value + " ");
		}
		System.out.println();
	}
	
	public static Integer getNumberOfObjects (Object[] objects) {
		Integer index = 0;
		while (index < objects.length && objects[index] != null) {
			index++;
		}
		return index;
	}

}
