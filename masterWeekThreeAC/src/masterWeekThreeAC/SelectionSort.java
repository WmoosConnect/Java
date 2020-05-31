/** Victor Hugo Vimos T 
 *  victor.vimos@epn.edu.ec
 *  victor.vimos@wmoos.com  **/

package masterWeekThreeAC;
import java.util.Arrays;
public class SelectionSort {
	
	public void sort(int[] arrA, boolean goPrint) {
		if(goPrint==true) System.out.println("Original Array: " + Arrays.toString(arrA));
		long start_ = System.nanoTime();
		for (int i = 0; i < arrA.length; i++) {

			// get the index of minimum element in unsorted array
			int minIndex = getMinIndex(i, arrA);

			// swap the min element with the left most element in the unsorted list.

			int temp = arrA[minIndex];
			arrA[minIndex] = arrA[i];
			arrA[i] = temp;
		}
		
		long end_ = System.nanoTime();
		if(goPrint==true) System.out.println("(Selection Sort)- Sorted Array: " + Arrays.toString(arrA));
		System.out.println("Time SelectionSort was: " + (end_ - start_) / 1000 + "us");
	}

	static int getMinIndex(int startIndex, int [] arrA){
	        int minIndex = startIndex;
	        for (int i = startIndex+1; i <arrA.length ; i++) {
	            if(arrA[minIndex]>arrA[i])
	                minIndex = i;
	        }
	        return minIndex;


	}
	
}
