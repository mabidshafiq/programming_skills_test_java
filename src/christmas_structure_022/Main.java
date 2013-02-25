package christmas_structure_022;

/**
 @author muhammad.abid
 */
/*
 * 
 * 22. Christmas structure

Write a program which will print the below structures according to the input provided to the program. The program should accept 3 inputs in the form of numbers between 1 and 9, both inclusive (one number per line) and then generate the corresponding structures based on the input.
Suppose the following sequence of numbers is supplied to the program:

INPUT

3
2
4
OUTPUT

  1
 2 2
3 3 3
 1
2 2
   1
  2 2
 3 3 3
4 4 4 4 
*/
import java.util.Scanner;
/*
22. Christmas structure

Write a program which will print the below structures according to the input provided to the program. The program should accept 3 inputs in the form of numbers between 1 and 9, both inclusive (one number per line) and then generate the corresponding structures based on the input.

Suppose the following sequence of numbers is supplied to the program:

INPUT

3
2
4
OUTPUT

  1
 2 2
3 3 3
 1
2 2
   1
  2 2
 3 3 3
4 4 4 4 
*/
class Main {

	public static void main(String args[]) {
		int a, b, c;
		Scanner in = new Scanner(System.in);
		a = in.nextInt();
		b = in.nextInt();
		c = in.nextInt();
		int[] array = { a, b, c };
		int k;
		boolean first = true;
		for (int x = 0; x < 3; x++) {
			int y = array[x];
			int z = y + 1;
			for (int i = 1; i <= y; i++) {
				if(!first){
					System.out.println();
					
				}
				first = false;
				
				System.out.format("%" + z + "s", "");

				for (int j = 1; j <= i; j++) {
					k = i;
					System.out.format("%" + 1 + "s", "");
					System.out.print(k);
				}
				z--;
			}
		}
	}
}