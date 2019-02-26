package Array.Medium;

import java.util.Scanner;

/**
 * @author Garima Chhikara
 * @date 15-Feb-2019
 *
 */

public class _775_GlobalLocalInversions {

	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();

		int[] arr = new int[n];

		for (int i = 0; i < arr.length; i++) {
			arr[i] = scn.nextInt();
		}

		System.out.println(isIdealPermutation(arr));

		scn.close();

	}

	static int globalInv = 0;

	public static boolean isIdealPermutation(int[] A) {

		// local inversion
		int localInv = 0;

		for (int i = 0; i < A.length - 1; i++) {

			if (A[i] > A[i + 1])
				localInv++;
		}

		// global inversion
		mergeSort(A, 0, A.length - 1);

		return localInv == globalInv;

	}

	public static int[] mergeSort(int[] arr, int lo, int hi) {

		if (lo == hi) {
			int[] br = new int[1];
			br[0] = arr[lo];
			return br;
		}

		int mid = (lo + hi) / 2;
		int[] fh = mergeSort(arr, lo, mid);
		int[] sh = mergeSort(arr, mid + 1, hi);

		int[] sorted = merge(fh, sh);

		return sorted;

	}

	public static int[] merge(int[] one, int[] two) {

		int[] merged = new int[one.length + two.length];

		int i = 0;
		int j = 0;
		int k = 0;

		while (i < one.length && j < two.length) {

			if (one[i] <= two[j]) {
				merged[k++] = one[i];
				i++;
			} else {
				merged[k++] = two[j];
				j++;

				globalInv += one.length - i;
			}
		}

		while (i < one.length) {
			merged[k++] = one[i];
			i++;
		}

		while (j < two.length) {
			merged[k++] = two[j];
			j++;
		}

		return merged;
	}

}
