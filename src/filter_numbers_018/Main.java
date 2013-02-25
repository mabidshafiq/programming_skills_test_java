package filter_numbers_018;

/**
 * @author muhammad.abid
 */

/*
 * 18. Filter numbers

Write a program that prints the numbers between 258 and 393 (both inclusive) which do not end with 5. The program should print the output so as to have one value per line. The output would therefore follow the below format:

OUTPUT

value1
value2
value3
.
.
.
.
.
*/
public class Main {

	public static void main(String[] args) {
		int start = 258;
		int end = 393;
		for (int i = start; i < end; i++) {
			if (i % 10 != 5) {
				System.out.println(i);
			}

		}

	}

}