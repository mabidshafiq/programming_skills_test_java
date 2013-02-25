package username_019;

import java.util.Scanner;

/**
 * @author muhammad.abid
 */
/*
19. Username

Sam wants to select a username in order to register on a website.

The rules for selecting a username are:

The minimum length of the username must be 5 characters and the maximum may be 10.
It should contain at least one letter from A-Z
It should contain at least one digit from 0-9
It should contain at least one character from amongst @#*=
It should not contain any spaces

Write a program which accepts 4 usernames (one username per line) as input and checks whether each of them satisfy the above mentioned conditions. If a username satisfies the conditions, the program should print PASS (in uppercase) If a username fails the conditions, the program should print FAIL (in uppercase)

Suppose the following usernames are supplied to the program:

INPUT

1234@a
ABC3a#@
1Ac@
ABC 3a#@
OUPTUT

FAIL
PASS
FAIL
FAIL
*/
public class Main {

	public static void main(String[] args) {
		String[] Array = new String[4];
		Scanner in = new Scanner(System.in);
		String pattern = "((?=.*[0-9])(?=.*[A-Z])(?=.*[@#*=])(?=[\\S]+$).{5,10})";

		for (int i = 0; i < Array.length; i++) {
			Array[i] = in.nextLine();
		}

		for (int i = 0; i < Array.length; i++) {
			if (Array[i].matches(pattern)) {
				System.out.println("PASS");
			} else {
				System.out.println("FAIL");
			}
		}
		in.close();

	}
}