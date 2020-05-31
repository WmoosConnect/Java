/** Victor Hugo Vimos T 
 *  victor.vimos@epn.edu.ec
 *  victor.vimos@wmoos.com  **/

package masterWeekTwoAC.homeWork;

import java.util.Random;

public class homeWork {

	public long ex1(int dim, boolean goPrint) {

		Random rand = new Random();

		int array_i[] = new int[dim];
		int array_j[] = new int[dim];
		int array_k[] = new int[dim];

		for (int i = 0; i < array_i.length; i++) {

			array_i[i] = rand.nextInt((dim - 0) + 1);
			array_j[i] = rand.nextInt((dim - 0) + 1);
			array_k[i] = rand.nextInt((dim - 0) + 1);

		}

		long start_ = System.nanoTime();
		int s = 0;

		for (int i = 0; i < array_i.length; i++) {

			for (int j = 0; j < array_j.length; j++) {

				for (int k = 0; k < array_k.length; k++) {

					s = s + array_i[i] + array_j[j] + array_k[k];

					if (goPrint == true)
						System.out.println("Arrays example 1 are: " + array_i[i] + " " + array_j[j] + " " + array_k[k]);
					if (goPrint == true)
						System.out.println("Sum example 1 is: " + s);

				}
			}
		}
		long end_ = System.nanoTime();
		return (end_ - start_);

	}

	public long ex2(int dim, boolean goPrint) {

		int A[] = new int[dim];
		int X[] = new int[dim];
		int s = 0;
		Random rand = new Random();

		for (int i = 0; i < X.length; i++) {

			X[i] = rand.nextInt((dim - 0) + 1);
		}

		long start_ = System.nanoTime();
		for (int i = 0; i < X.length; i++) {

			s = X[i];

			for (int j = 1; j == i; j++) {
				s = s + X[j];
				A[i] = s / (i + 1);
			}

		}
		long end_ = System.nanoTime();

		if (goPrint == true) {
			for (int i = 0; i < X.length; i++) {
				System.out.println("Array values are:" + X[i]);
			}
		}

		return (end_ - start_);

	}

	public long ex3(int dim) {

		int A[] = new int[dim];
		int X[] = new int[dim];
		Random rand = new Random();

		for (int i = 0; i < X.length; i++) {

			X[i] = rand.nextInt((dim - 0) + 1);
		}

		long start_ = System.nanoTime();

		int s = 0;

		for (int i = 0; i < X.length; i++) {

			s = s + X[i];
			A[i] = s / (i + 1);

		}

		long end_ = System.nanoTime();

		return (end_ - start_);
	}

	public double ex4(int x, int n) {

		if (n == 0) {
			return 1;
		}
		if (n % 2 == 1) {
			double y = ex4(x, (n - 1) / 2);
			return x * y * y;
		} else {
			double y = ex4(x, n / 2);
			return y * y;

		}

	}

	public boolean ex5(int[] A, int dim) {

		for (int i = 0; i < dim; i++) {

			for (int j = i + 1; j < dim; j++) {

				if (A[i] == A[j])
					return false;
			}
		}
		return true;

	}

	public void ex6(int[] a, int n) {
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
		ex6(l, mid);
		ex6(r, n - mid);

		merge(a, l, r, mid, n - mid);
	}

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

}
