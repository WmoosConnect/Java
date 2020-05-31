/** Victor Hugo Vimos T 
 *  victor.vimos@epn.edu.ec
 *  victor.vimos@wmoos.com  **/

package masterWeekTwoAC.homeWork;

import java.util.Arrays;
import java.util.Random;

public class mainHomeWork {

	public static void main(String[] args) {

		boolean goPrint = false;
		int dim = 1500;
		int X[] = new int[dim];
		int Y[] = new int[dim];

		Random rand = new Random();
		for (int i = 0; i < X.length; i++) {
			X[i] = rand.nextInt(dim );
			Y[i] = rand.nextInt(dim );
		}

		int[] actual = X;

		homeWork practice = new homeWork();

		System.out.println("Time example 1 was: " + practice.ex1(dim, goPrint) / 1000 + " us");
		System.out.println("Time example 2 was: " + practice.ex2(dim, goPrint) / 1000 + " us");
		System.out.println("Time example 3 was: " + practice.ex3(dim) / 1000 + " us");

		/** ======================== EXAMPLE 4 ============================ **/
		long start_ex4 = System.nanoTime();
		System.out.println("Response example 4 is: " + practice.ex4(2, 9));
		long end_ex4 = System.nanoTime();
		System.out.println("Time example 4 was: " + (end_ex4 - start_ex4) / 1000 + " us");
		/** ============================================================== **/

		/** ======================== EXAMPLE 5 ============================ **/
		if(goPrint==true)System.out.println("Original Array: " + Arrays.toString(Y));
		long start_ex5 = System.nanoTime();
		System.out.println("Response example 5 is: " + practice.ex5(Y, Y.length));
		long end_ex5 = System.nanoTime();
		System.out.println("Time example 5 was: " + (end_ex5 - start_ex5) / 1000 + " us");

		/** ============================================================== **/

		/** ======================== EXAMPLE 6 ============================ **/
		long start_ex6 = System.nanoTime();
		practice.ex6(actual, actual.length);
		long end_ex6 = System.nanoTime();
		System.out.println("Time example 6 was: " + (end_ex6 - start_ex6) / 1000 + " us");
		/** ============================================================== **/

	}

}
