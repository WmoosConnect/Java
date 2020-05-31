/** Victor Hugo Vimos T 
 *  victor.vimos@epn.edu.ec
 *  victor.vimos@wmoos.com  **/

package masterWeekThreeAC;
import java.util.Arrays;


public class InsertionSort {

	public void sort(int [] arrA, boolean goPrint){

		if(goPrint==true) System.out.println("Original Array: " + Arrays.toString(arrA));
	        long start_ = System.nanoTime();
	        for (int i = 0; i <arrA.length ; i++) {
	            int j = i;
	            while(j>0){
	                //check if current element is smaller than previous element
	                if(arrA[j]<arrA[j-1]){
	                    //swap the elements
	                    int temp = arrA[j];
	                    arrA[j] = arrA[j-1];
	                    arrA[j-1] = temp;
	                }
	                j--;
	            }
	        }
	        long end_ = System.nanoTime();
	        
	        if(goPrint==true) System.out.println("(Insertion Sort)- Sorted Array: " +  Arrays.toString(arrA));
	        System.out.println("Time InsertionSort was: " + (end_ - start_) / 1000 + "us");

	}
}
