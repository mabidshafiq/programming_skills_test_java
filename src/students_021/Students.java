package students_021;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

/**
 * @author muhammad.abid
 */
/*
 * 21. Students

Write a program that accepts 10 student records (roll number and score) and prints them in decreasing order of scores. In case there are multiple records pertaining to the same student, the program should choose a single record containing the highest score. The program should be capable of accepting a multi-line input. Each subsequent line of input will contain a student record, that is, a roll number and a score (separated by a hyphen). The output should consist of the combination of roll number and corresponding score in decreasing order of score.

INPUT

1001-40
1002-50
1003-60
1002-80
1005-35
1005-55
1007-68
1009-99
1009-10
1004-89
OUTPUT

1009-99
1004-89
1002-80
1007-68
1003-60
1005-55
1001-40 
*/
public class Students {

	public static void main(String[] args) {
		String input;
		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();

		Scanner in = new Scanner(System.in);
		for (int i = 0; i < 10; i++) {
			input = in.nextLine();
			String[] arrInput = input.split("-");
			int key = Integer.valueOf(arrInput[0]);

			if (map.containsKey(key)) {
				int value = map.get(key);
				if (value < Integer.valueOf(arrInput[1])) {
					map.put(key, Integer.valueOf(arrInput[1]));
				}
			} else {
				map.put(key, Integer.valueOf(arrInput[1]));
			}

		}

		List<Integer> values = new ArrayList(map.values());

		Collections.sort(values);

		List<Integer> keys = new ArrayList(map.keySet());

		for (int i = values.size() - 1; i >= 0; i--) {

			for (Integer key : keys) {
				if (map.get(key) == values.get(i)) {
					System.out.println(key + "-" + values.get(i));
				}

			}

		}

	}
}