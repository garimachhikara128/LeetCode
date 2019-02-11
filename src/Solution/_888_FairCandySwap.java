package Solution;

import java.util.Scanner;

/**
 * @author Garima Chhikara
 * @date 11-Feb-2019
 *
 */

public class _888_FairCandySwap {

	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);

		int n = scn.nextInt();
		int[] A = new int[n];

		for (int i = 0; i < n; i++) {
			A[i] = scn.nextInt();
		}

		int m = scn.nextInt();
		int[] B = new int[m];

		for (int i = 0; i < m; i++) {
			B[i] = scn.nextInt();
		}

		int[] ans = fairCandySwap(A, B);

		for (int val : ans)
			System.out.print(val + " ");

		scn.close();

	}

	public static int[] fairCandySwap(int[] A, int[] B) {

		int[] ans = new int[2];

		int sum1 = 0;
		for (int val : A) {
			sum1 += val;
		}

		int sum2 = 0;
		for (int val : B) {
			sum2 += val;
		}

		// Alice transfers to Bob
		for (int i = 0; i < A.length; i++) {

			sum1 -= A[i];
			sum2 += A[i];

			if (sum1 >= sum2) {

				// undo the changes
				sum1 += A[i];
				sum2 -= A[i];

				continue;

			}

			// Bob tranfers to Alice
			for (int j = 0; j < B.length; j++) {

				sum1 += B[j];
				sum2 -= B[j];

				if (sum1 == sum2) {
					ans[0] = A[i];
					ans[1] = B[j];

					return ans;
				}

				// undo the changes
				sum1 -= B[j];
				sum2 += B[j];

			}

			sum1 += A[i];
			sum2 -= A[i];

		}

		return ans;

	}

}
