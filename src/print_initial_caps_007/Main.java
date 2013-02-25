package print_initial_caps_007;

/**
 @author muhammad.abid
 */
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/*
*
    7. Print initial caps
	Write a program which will accept three sentences (one sentence per line) and print the words having Initial Caps within the sentences. Below is an example.
	
	Here is an example. If the below three sentences are given to the program as input,
	
	INPUT
	
	This is a Program Coding test of Initial Caps the program Will Test You Then, the output would look like:
	
	OUTPUT
	
	This
	
	Program Coding Initial Caps Will Test You
*/
class Main {

	public static void main(String args[]) {
		Scanner kb = new Scanner(System.in);
		final String input1 = kb.nextLine();
		final String input2 = kb.nextLine();
		final String input3 = kb.nextLine();

		printWord(input1);
		printWord(input2);
		printWord(input3);

	}

	public static void printWord(String value) {

		String arr[] = value.split(" ");

		for (int i = 0; i < arr.length; i++) {
			String b = arr[i];
			Pattern p = Pattern.compile("^[A-Z]");
			Matcher m = p.matcher(b);

			if (m.find()) {
				System.out.println(b);
			}

		}
	}
}