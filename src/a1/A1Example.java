package a1;

import java.util.Scanner;
import java.math.BigDecimal;
import java.text.DecimalFormat;

public class A1Example {

	public static void main(String[] args) {
		// Print out the Java version number, just to let 
		// you know what Eclipse thinks it is using and
		// so that you can confirm that it is 10.0 or higher.
		
		System.out.println("Your Java version: " + System.getProperty("java.version"));
		
		// Set up scanner object to read space-separated values
		// from console input
		
		Scanner scan = new Scanner(System.in);
		
		int a = scan.nextInt();
		String[] output = new String[a];
		for (int b=0; b<a;b++) {

		// Read in count of numbers to process
		String FirstName = scan.next();
		char c=FirstName.charAt(0);
		String SecondName = scan.next();
		
		int count = scan.nextInt();
		
		
		// Create an array to store numbers.
		
		
		//String[] values = new String[count];
		
		
		// Read values into the array
		double sum = 0;
		for (int i=0; i<count; i++) {
			// values[i] = scan.nextInt();
			double[] values = new double[2];
			values[0] = scan.nextInt();
			String Goods = scan.next();
			values[1] = scan.nextDouble();
			 sum += values[0]*values[1];
			//String Goods = scan.next();
			//int price = scan.nextInt();
			 
		}
		output[b] = c+". "+SecondName+": "+sum;
		}
		
		// All input parsed, so close scanner
		scan.close();
		
		// Use helper functions to calculate sum, min, and max
	
//		int sum = calculateValueSum(values);
//		int min = findValueMin(values);
//		int max = findValueMax(values);
		
		// Print results
		//System.out.println(output);
		   for (int d=0; d<a; d++) {
		        System.out.println(output[d]);
		    }
//		System.out.println("Min: " + min);
//		System.out.println("Max: " + max);
//		System.out.println("Average: " + String.format("%.2f", ((double) sum) / ((double) count)));
		
	}
	
	/* calculateValueSum 
	 * Calculates the sum on an array of integers
	 *
	 * Input: array of integers vals
	 * 
	 * Output: integer sum of values in vals
	 * 
	 * Preconditions:
	 * Input array must not be null.
	 */
	
	//static int calculateValueSum(int[] vals) {
		
	//	int sum = 0;
		
	//	for (int i=0; i<vals.length; i++) {
	//		sum += vals[i];
	//	}
		
	//	return sum;
	//}
	
	/* findValueMin
	 * Finds and returns the minimum value in an array of integers
	 * 
	 * Input: array of integers vals
	 * 
	 * Output: minimum value found within the array
	 * 
	 * Preconditions:
	 * Input array must not be null and must contain at least one value.
	 */
	
	//static int findValueMin(int[] vals) {
		
		// Initialize current minimum to first value in array.
	//	int cur_min = vals[0];
		
		// Starting with second value (if any), compare each value
		// in array with current minimum and replace if smaller.
		
	//	for (int i=1; i < vals.length; i++) {
	//		if (vals[i] < cur_min) {
	//			cur_min = vals[i];
	//		}
	//	}
		
	//	return cur_min;
	//}

	/* findValueMax
	 * Finds and returns the maximum value in an array of integers
	 * 
	 * Input: array of integers vals
	 * 
	 * Output: maximum value found within the array
	 * 
	 * Preconditions:
	 * Input array must not be null and must contain at least one value.
	 */
	
//	static int findValueMax(int[] vals) {
		
		// Initialize current minimum to first value in array.
//		int cur_max = vals[0];
		
		// Starting with second value (if any), compare each value
		// in array with current minimum and replace if smaller.
		
//		for (int i=1; i < vals.length; i++) {
//			if (vals[i] > cur_max) {
//				cur_max = vals[i];
//			}
//		}
		
//		return cur_max;
//	}

}
