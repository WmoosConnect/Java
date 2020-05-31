/** Victor Hugo Vimos T 
 *  victor.vimos@epn.edu.ec
 *  victor.vimos@wmoos.com  **/

package masterWeekThreeAC;
import java.util.Random;

import java.util.Arrays;

public class mainHomeWork {
	
	static int[] randomArray(int dim){
		
		int X [] = new int [dim];
		Random rand = new Random();
		
		for (int i = 0; i < X.length; i++) {
			
			X[i] = rand.nextInt(dim);
		}
		int[] arrA = X;
	
		return arrA;
	}

	public static void main(String[] args) {
		
		int dimArray=6000;
		boolean goPrint=false;

		BubbleSort     practiceBubbleSort     = new BubbleSort();
		CountingSort   practiceCountingSort   = new CountingSort();
		InsertionSort  practiceInsertionSort  = new InsertionSort();
		SelectionSort  practiceSelectionSort  = new SelectionSort();
		MergeSort      practiceMergeSort      = new MergeSort();
		QuickSort      practiceQuickSort      = new QuickSort();
		LinealSearch   practiceLinealSearch   = new LinealSearch();
		BinarySearch   practiceBinarySearch   = new BinarySearch();
		HeapSort       practiceHeapSort       = new HeapSort();
	
		practiceBubbleSort.sort(randomArray(dimArray),goPrint);			
		practiceCountingSort.sort(randomArray(dimArray),goPrint);		
		practiceInsertionSort.sort(randomArray(dimArray),goPrint);
		practiceSelectionSort.sort(randomArray(dimArray),goPrint);
		
		
		/**================ MERGESORT =======================**/
		int X [] = new int [dimArray];
		X=randomArray(dimArray);
		
		if(goPrint==true) System.out.println("Original Array: " + Arrays.toString(X));	
		long start_ =  System.nanoTime();
		practiceMergeSort.sort(X,dimArray);
	    long end_ =  System.nanoTime();
	    if(goPrint==true) System.out.println("(Merge Sort)- Sorted Array: " + Arrays.toString(X));
	    System.out.println("Time MergeSort was: "+ (end_-start_)/1000+"us");
	    /**==================================================**/
	    

	    /**================ QUICKSORT =======================**/
	    practiceQuickSort.begin(dimArray);	    
		for (int j = 0; j < dimArray; j++) {
			long Y = (int) (Math.random() * 9999);
			
			practiceQuickSort.fillin(Y);
		}
		long start_quick =  System.nanoTime();
		if(goPrint==true) practiceQuickSort.display();
		practiceQuickSort.sort();
		if(goPrint==true) practiceQuickSort.display();
		long end_quick =  System.nanoTime();
		System.out.println("Time QuickSort was: "+ (end_quick-start_quick)/1000+"us");
		/**==================================================**/

		
		/** ================ LINEAL SEARCH====================== **/

		int Z[] = new int[dimArray];
		Z = randomArray(dimArray);
		long start_linear =  System.nanoTime();
		practiceLinealSearch.search(Z, Z[dimArray / 2],goPrint);
		long end_linear =  System.nanoTime();
		System.out.println("Time LinearSearch was: "+ (end_linear-start_linear)/1000+"us");

		/** ==================================================== **/

		/** ================ BINARY SEARCH====================== **/
		int W[] = new int[dimArray];
		int target=10;
		boolean answer= false;
		W = randomArray(dimArray);
		practiceBinarySearch.fillin(W);
		long start_binary =  System.nanoTime();
		answer=practiceBinarySearch.search(0,W.length-1,target);
		long end_binary =  System.nanoTime();
		System.out.println("Time BinarySearch was: "+ (end_binary-start_binary)/1000+"us");
		if(goPrint == true)System.out.println("Is the value "+ target + " present in the array?:" + answer);

		/** ==================================================== **/
		

		/** ================ HEAPSORT ====================== **/
		int P[] = new int[dimArray];
        
		P = randomArray(dimArray);
		long start_heap =  System.nanoTime();
		if (goPrint == true)System.out.println("Original array is: " + Arrays.toString(P));
		practiceHeapSort.sort(P);
		long end_heap =  System.nanoTime();
		System.out.println("Time HeapSort was: "+ (end_heap-start_heap)/1000+"us");
		if(goPrint == true)System.out.println("Sorted array is (Heap Sort): " + Arrays.toString(P));

		/** ================================================ **/

	}

}
