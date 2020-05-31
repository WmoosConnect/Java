/** Victor Hugo Vimos T 
 *  victor.vimos@epn.edu.ec
 *  victor.vimos@wmoos.com  **/

package masterWeekThreeAC;
import java.util.Arrays;

public class BubbleSort {

	public void sort(int[] arrA, boolean goPrint) {

		if (arrA == null || arrA.length == 0)
			return;
		if(goPrint==true) System.out.println("Original Array: " + Arrays.toString(arrA));
		int size = arrA.length;

		long start_ = System.nanoTime();
		for (int i = 0; i < size - 1; i++) {
			for (int j = 0; j < size - i - 1; j++) {
				// check the adjacent elements
				if (arrA[j] > arrA[j + 1]) {
					// swap the elements
					int temp = arrA[j];
					arrA[j] = arrA[j + 1];
					arrA[j + 1] = temp;
				}
			}
		}
		if(goPrint==true) System.out.println("Sorted Array: " + Arrays.toString(arrA));
		long end_ = System.nanoTime();
		System.out.println("Time BubbleSort was: " + (end_ - start_) / 1000 + "us");
	}

}
