package employee_and_events_017;

import java.util.Scanner;
/**
 * @author muhammad.abid
 */
/*
17. Employee and events

Ross is an event organizer. He has received data regarding the participation of employees in two different events. Some employees have participated in only one event and others have participated in both events. Ross now needs to count the number of employees who have taken part in both events. The records received by Ross consist of employee ids, which are unique. Write a program that accepts the employee ids participating in each event (the first line relates to the first event and the second line relates to the second event). The program should print the number of common employee ids in both the events.

INPUT

1001,1002,1003,1004,1005
1106,1008,1005,1003,1016,1017,1112
Now the common employee ids are 1003 and 1005, so the program should give the output as:

OUTPUT

2
*/
class Main {

	public static void main(String args[]) {
		String firstLine;
		String secondLine;
		Scanner in = new Scanner(System.in);
		firstLine = in.nextLine();
		secondLine = in.nextLine();
		String delimiter = "\\,";
		String[] array1 = firstLine.split(delimiter); // array1{1001,1002,1003,1004,1005};
		String[] array2 = secondLine.split(delimiter); // array2{1106,1008,1005,1003,1016,1017,1112};
		compare(array1, array2);
	}

	public static void compare(String id1[], String id2[]) {
		int k = 0;
		for (int i = 0; i < id1.length; i++) {
			int x = Integer.parseInt(id1[i]);
			for (int j = 0; j < id2.length; j++) {
				int y = Integer.parseInt(id2[j]);
				if (x == y) {
					k++;
				}
			}
		}
		System.out.println(k);
	}
}
