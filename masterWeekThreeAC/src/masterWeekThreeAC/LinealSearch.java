/** Victor Hugo Vimos T 
 *  victor.vimos@epn.edu.ec
 *  victor.vimos@wmoos.com  **/

package masterWeekThreeAC;

public class LinealSearch {
	
	
		public void search(int [] arr, int target,boolean goPrint){
			
	        for (int guess = 0;  guess <arr.length ;  guess++) {
	            if(arr[ guess]==target) {
	            	if(goPrint == true)System.out.println("Element " + target + " is found at pos: " +  guess);
	               return;
	            }
	        }
	        
	        //if here means target is not found
	        if(goPrint == true)System.out.println("Element " + target + " is not found in array");    
	    }
		
	

}
