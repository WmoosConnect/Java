package masterWeekOneAC.homeWork;
import java.util.Arrays;
/** Victor Hugo Vimos T 
 *  victor.vimos@epn.edu.ec
 *  victor.vimos@wmoos.com  **/

public class homeWork {
	
	public int ex1(int max) {

		int array[] = { 16, 20, 13, 51, 23, 100, 2, 7, 21, 33 };
		double start_ = System.nanoTime();
		Arrays.sort(array);

		double end_ = System.nanoTime();
		System.out.println("Elapsed Times was: " + (end_ - start_) / 1000 + " us");
		return array[array.length - max];
	}
	
	public int ex2(int max) {
		int array[] = { 16, 20, 13, 51, 23, 100, 2, 7, 21, 33 };
		int aux;
		int[] anArray;
		anArray = new int[max];

		double start_ = System.nanoTime();

		for (int i = 0; i <= (max - 1); i++) {
			anArray[i] = array[i];
		}

		Arrays.sort(anArray);

		if (anArray.length % 2 == 0) {

			int goesUntil = (anArray.length / 2) - 1;

			for (int i = 0; i <= goesUntil; i++) {
				aux = anArray[anArray.length - (i + 1)];
				anArray[anArray.length - (i + 1)] = anArray[i];
				anArray[i] = aux;
			}
		} else {

			int goesUntil = ((anArray.length + 1) / 2) - 1;
			for (int i = 0; i <= goesUntil; i++) {
				aux = anArray[anArray.length - (i + 1)];
				anArray[anArray.length - (i + 1)] = anArray[i];
				anArray[i] = aux;
			}
		}

		for (int i = max; i < array.length; i++) {

			if (anArray[max - 1] < array[i]) {

				anArray[max - 1] = array[i];

				Arrays.sort(anArray);

				if (anArray.length % 2 == 0) {

					int goesUntil = (anArray.length / 2) - 1;

					for (int j = 0; j <= goesUntil; j++) {
						aux = anArray[anArray.length - (j + 1)];
						anArray[anArray.length - (j + 1)] = anArray[j];
						anArray[j] = aux;
					}
				} else {

					int goesUntil = ((anArray.length + 1) / 2) - 1;

					for (int k = 0; k <= goesUntil; k++) {
						aux = anArray[anArray.length - (k + 1)];
						anArray[anArray.length - (k + 1)] = anArray[k];
						anArray[k] = aux;
					}
				}
			}
		}
		double end_ = System.nanoTime();
		System.out.println("Elapsed Times was: " + (end_ - start_) / 1000 + " us");
		return anArray[max - 1];
	}


    
}
