package dates_format_016;

/**
 @author muhammad.abid
 */
import java.text.DateFormatSymbols;
import java.util.Calendar;
import java.util.Scanner;

/*
 16. Dates format

 Write a program which will take the year (yyyy) and the numeric sequence of the month (0-11) as its input. The program will return the day on which the 28th of that particular month and year falls. The input can consist of two year-month combinations, one combination per line.

 The numeric sequence of months is as follows:

 0 – Jan 1 – Feb 2 – March and so on......

 The format for supplying the input is:

 1999-5

 Where 1999 is the year and 5 is the numeric sequence of the month (corresponding to June). The program should display the day on which June 28, 1999 fell, and in this case the output will be MONDAY.

 The output should be displayed in uppercase letters.

 INPUT

 1999-5
 1998-6
 OUTPUT

 MONDAY
 TUESDAY
 */
public class Main {

	public static void main(String[] args) {
		boolean condition = false;

		Scanner scanner = new Scanner(System.in);
		String value = scanner.nextLine();
		String value1 = scanner.nextLine();
		calculate(value);
		calculate(value1);
	}

	private static void calculate(String value) {
		final String[] input = value.split("-");
		Calendar cl = Calendar.getInstance();
		cl.set(Integer.parseInt(input[0]), Integer.parseInt(input[1]), 28);
		String[] weekdays = new DateFormatSymbols().getWeekdays();
		System.out
				.println(weekdays[cl.get(Calendar.DAY_OF_WEEK)].toUpperCase());

	}

}