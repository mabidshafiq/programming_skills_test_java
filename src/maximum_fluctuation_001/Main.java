package maximum_fluctuation_001;

import java.util.Scanner;

/**
@author muhammad.abid
 */
/*
 * 1. Maximum fluctuation

Write a program that accepts a comma separated string of numbers depicting the daily stock price of AXY Company. The program should calculate the biggest daily fluctuation (in terms of percentage) of the stock price on any given day.

For example, let us suppose the following is the input string:

INPUT

20,23,25,30,22,21,16
Then the corresponding biggest fluctuation is:

OUTPUT

26.6666666666667 (As the maximum fluctuation in price is between 22 and 30)
*/

public class Main {
	
	public static void main(String [] args){

		Scanner kb = new Scanner(System.in);
		final String input = kb.nextLine();
		
		String[] prices = input.split(",");
		
		double average = 0;
		double maxPrice = 0;
	
		for(String price: prices){
			maxPrice = (Double.valueOf(price)>maxPrice ? Double.valueOf(price):maxPrice);
			average += Double.valueOf(price);
		}
		
		average  =  Math.floor((average / prices.length));
		double fluc = (maxPrice - average) / maxPrice * 100;
		System.out.println(fluc);
	}
}

