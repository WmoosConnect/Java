/** Victor Hugo Vimos T 
 *  victor.vimos@epn.edu.ec
 *  victor.vimos@wmoos.com  **/

package masterWeekThreeAC;
import java.util.Arrays;

public class CountingSort {

	public int[] sort(int[] A,boolean goPrint) {
	
		if(goPrint==true)System.out.println("Original Array " + Arrays.toString(A));
		
		long start_ =  System.nanoTime();
		
		int[] Result = new int[A.length + 1];
		int[] Count = new int[A.length + 1];

		for (int i = 0; i < Count.length; i++) {
			Count[i] = 0;  // put count for every element as 0
		}
		
		// Count[] will store the counts of each integer in the given array
		for (int i = 0; i < A.length; i++) {
			int x = Count[A[i]];
			x++;
			Count[A[i]] = x;

		}
		// Update the Count[] so that each index will store the sum till
		// previous step. (Count[i]=Count[i] + Count[i-1]).
		// Now updated Count[] array will reflect the actual position of each
		// integer in Result[].

		for (int i = 1; i < Count.length; i++) {
			Count[i] = Count[i] + Count[i - 1];
		}
		
		// Now navigate the input array taking one element at a time,
		// Count[input[i]] will tell you the index position of input[i] in
		// Result[]. When you do that, decrease the count in Count[input[i]] by
		// 1.
		
		for (int i = A.length - 1; i >= 0; i--) {
			int x = Count[A[i]];
			Result[x] = A[i];
			x--;
			Count[A[i]] = x;

		}

	    long end_ =  System.nanoTime();
	    System.out.println("Time CountingSort was: "+ (end_-start_)/1000+"us");
	    
		if(goPrint==true)System.out.println("Sorted Array : " + Arrays.toString(Result));
		
		
		
		return Result;

	}
}
