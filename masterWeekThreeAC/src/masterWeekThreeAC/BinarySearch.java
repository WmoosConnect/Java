/** Victor Hugo Vimos T 
 *  victor.vimos@epn.edu.ec
 *  victor.vimos@wmoos.com  **/

package masterWeekThreeAC;

public class BinarySearch {
	

		private int [] arrA;
		
		public void  fillin(int [] narrA){
			arrA = narrA;
		}
		
		public Boolean search(int low,int high, int target){
			if(low>high){
				return false;
			}
			int mid = low + ((high - low) / 2);
			if(arrA[mid]==target)return true;
			else if (arrA[mid]>target) return search(low,mid-1,target);
			else return search(mid+1,high,target);
		}


}
