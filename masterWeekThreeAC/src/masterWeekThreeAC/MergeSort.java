/** Victor Hugo Vimos T 
 *  victor.vimos@epn.edu.ec
 *  victor.vimos@wmoos.com  **/

package masterWeekThreeAC;

public class MergeSort {
	
	static void merge(int[] a, int[] l, int[] r, int left, int right) {

		int i = 0;
		int j = 0;
		int k = 0;

		while (i < left && j < right) {
			if (l[i] <= r[j]) {
				a[k++] = l[i++];
			} else {
				a[k++] = r[j++];
			}
		}
		/** left sorting **/
		while (i < left) {
			a[k++] = l[i++];
		}
		/** left sorting **/
		while (j < right) {
			a[k++] = r[j++];

		}
	}

	public void sort(int[] a, int n) {
		/** mergeSort **/
		if (n < 2) {
			return;
		}
		int mid = n / 2;
		int[] l = new int[mid];
		int[] r = new int[n - mid];

		for (int i = 0; i < mid; i++) {
			l[i] = a[i];
		}
		for (int i = mid; i < n; i++) {
			r[i - mid] = a[i];
		}
		sort(l, mid);
		sort(r, n - mid);

		merge(a, l, r, mid, n - mid);
	}

}
