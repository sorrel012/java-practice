package com.sorrel012.ifstatement.examples;

public class SwitchExercisesRunner {
	public static void main(String[] args) {
		System.out.println(determineNameOfDay(1));
	}

	public static String determineNameOfDay(int dayNumber) {
		String result = "";
		switch (dayNumber) {
		case 0:
			result = "Sunday";
			break;
		case 1:
			result = "Monday";
			break;
		case 2:
			result = "Tuesday";
			break;
		case 3:
			result = "Wednesday";
			break;
		case 4:
			result = "Thursday";
			break;
		case 5:
			result = "Friday";
			break;
		case 6:
			result = "Saturday";
			break;

		}

		return result;
	}

}
