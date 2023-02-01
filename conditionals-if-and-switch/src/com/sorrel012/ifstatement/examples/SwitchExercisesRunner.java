package com.sorrel012.ifstatement.examples;

public class SwitchExercisesRunner {
	public static void main(String[] args) {
		System.out.println(determineNameOfDay(8));
		System.out.println(isWeekDay(3));
	}

	public static boolean isWeekDay(int dayNumber) {
		switch (dayNumber) {
		case 0:
			return false;
		case 1:
			return true;
		case 2:
			return true;
		case 3:
			return true;
		case 4:
			return true;
		case 5:
			return true;
		case 6:
			return false;
		}

		return false;

	}

	public static String determineNameOfDay(int dayNumber) {
		switch (dayNumber) {
		case 0:
			return "Sunday";
		case 1:
			return "Monday";
		case 2:
			return "Tuesday";
		case 3:
			return "Wednesday";
		case 4:
			return "Thursday";
		case 5:
			return "Friday";
		case 6:
			return "Saturday";
		default:
			return "Invalid day";
		}
	}

}
