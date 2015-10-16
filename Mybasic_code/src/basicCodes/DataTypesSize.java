package basicCodes;

import java.text.DateFormat.Field;

public class DataTypesSize {
	private static void printDataTypeDetails(final Class clazz) {
		System.out.println("\nDatatype (Class): " + clazz.getCanonicalName()
				+ ":");
		final java.lang.reflect.Field[] fields = clazz.getDeclaredFields();
		for (final java.lang.reflect.Field field : fields) {
			final String fieldName = field.getName();
			try {
				switch (fieldName) {
				case "SIZE": // generally introduced with 1.5 (twos complement)
					System.out.println("\tSize (in bits): " + field.get(null));
					break;
				case "BYTES": // generally introduced with 1.8 (twos complement)
					System.out.println("\tSize (in bytes): " + field.get(null));
					break;
				case "MIN_VALUE":
					System.out.println("\tMinimum Value: " + field.get(null));
					break;
				case "MAX_VALUE":
					System.out.println("\tMaximum Value: " + field.get(null));
					break;
				default:
					break;
				}
			} catch (IllegalAccessException illegalAccess) {
				System.out.println("ERROR: Unable to reflect on field "
						+ fieldName);
			}
		}
	}

	public static void main(final String[] arguments) {
		printDataTypeDetails(Byte.class);
		printDataTypeDetails(Short.class);
		printDataTypeDetails(Integer.class);
		printDataTypeDetails(Long.class);
		printDataTypeDetails(Float.class);
		printDataTypeDetails(Double.class);
		printDataTypeDetails(Character.class);
		printDataTypeDetails(Boolean.class);
	}
}
