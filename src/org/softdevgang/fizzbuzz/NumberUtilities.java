package org.softdevgang.fizzbuzz;

public class NumberUtilities {
	public static String isHigher(double d) {
		if (3.1 < d) {
			return "high";
		}
		return "low";
	}

	public static String isHigher(int d) {
		// if changed to 2 defect not detected
		if (3 <= d) {
			return "high";
		}
		return "low";
	}

	public static String isHigherOrEqual(double d) {
		if (3.1 <= d) {
			return "high";
		}
		return "low";
	}

	public static boolean contains(String string) {
		// can change to equals
		return "Sleepy".equalsIgnoreCase(string);
	}

}