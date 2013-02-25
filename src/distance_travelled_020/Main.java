package distance_travelled_020;

/**
 * @author muhammad.abid
 */
import java.util.Scanner;

/*
20. Distance travelled

Write a program to calculate the distance travelled by a car at different time intervals. The initial velocity of the car is 36 km/hr and the constant acceleration is 5 m/s2.

The formula to calculate distance is:

Distance Travelled = u*t+((a*t*t)/2) where, u = initial velocity of the car (36 km/hr) a = acceleration of the car (5 m/s2) t = time duration in seconds

The program should accept 2 time intervals as the input (one time interval per line) and print the distance travelled in meters by the car (one output per line).

Definitions: 1 kilometer = 1000 meters 1 hour = 3600 seconds

Let us suppose following are the inputs supplied to the program

INPUT

10
8
OUTPUT

350
240
*/
class Main {
	public static void calculateDistance(int t1, int t2) {
		int u = 10; // in m/s
		int a = 5; // in m/s2
		int distanceTravel1 = u * t1 + ((a * t1 * t1) / 2);
		int distanceTravel2 = u * t2 + ((a * t2 * t2) / 2);
		System.err.println(distanceTravel1);
		System.err.println(distanceTravel2);
	}

	public static void main(String args[]) {
		int firstValue;
		int secondValue;
		Scanner in = new Scanner(System.in);
		firstValue = in.nextInt();
		secondValue = in.nextInt();
		calculateDistance(firstValue, secondValue);
	}
}
