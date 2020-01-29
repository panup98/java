package com.anup.misc;

public class SwitchDemo {

	public static void main(String[] args) {

		String inputDay = args[0];
		System.out.println("Enteredday Day:"+inputDay);
		
		Days convertedInput = mappingDaysToEnums(inputDay);
		System.out.println("Enum map day:"+convertedInput);
		
		

		switch (convertedInput) {
		case MONDAY:
			System.out.println("Working Day");
			break;

		case TUESDAY:
			System.out.println("Working Day");
			break;

		case WEDNESDAY:
			System.out.println("Working Day");
			break;

		case THURSDAY:
			System.out.println("Working Day");
			break;

		case FRIDAY:
			System.out.println("Working Day");
			break;

		case SATURDAY:
			System.out.println("Holiday");
			break;
			
		case SUNDAY:
			System.out.println("Holiday");
			break;

		default:
			break;
		}
	}

	private static Days mappingDaysToEnums(String day) {
		
		Days days = Days.MONDAY;
		
		String dayAgain = day.toLowerCase();
		
		switch (dayAgain) {
		case "mon":
			days = Days.MONDAY;
			break;
		case "tue":
			days = Days.TUESDAY;
			break;
		case "wed":
			days = Days.WEDNESDAY;
			break;
		case "sun":
			days = Days.SUNDAY;
			break;	

		default:
			break;
		}
		
		return days;
	}

}

enum Days{
	MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY
	}
