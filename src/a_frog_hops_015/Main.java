package a_frog_hops_015;

import java.util.Scanner;

/**
 * @author muhammad.abid
 */

/*
15. A frog hops

Kermit, a frog hops in a particular way such that: 1. He hops 20cm in the first hop, 10cm in the second hop and 5cm in the third hop. 2. After three hops Kermit rests for a while and then again follows the same hopping pattern.

Calculate the total distance travelled by Kermit (in centimeters) for the provided number of hops. Exactly 4 numbers of hops will be provided to the program (one number per line) as per the below example.

INPUT Suppose the following number of hops is provided to the program:

4
6
3
5
OUTPUT Then the total distance covered should be displayed as follows:

55
70
35
65
*/
public class Main {

	public static void main(String[] args) {
		int a, b, c, d;
		Scanner in = new Scanner(System.in);
		a = in.nextInt();
		b = in.nextInt();
		c = in.nextInt();
		d = in.nextInt();
		int[] array = { a, b, c, d };
		int k = 0;

		for (int i = 0; i < array.length; i++) {
			int n = array[i];
			int x = n / 3;
			int y = n % 3;
			int z = x * 35;

			switch (y) {
			case 0:
				k = 0 + z;
				break;
			case 1:
				k = 20 + z;
				break;
			case 2:
				k = 30 + z;
				break;
			case 3:
				k = 35 + z;
				break;
			}
			System.out.println(k);
		}
	}
}
