package Array.Easy;

import java.util.Scanner;

/**
 * @author Garima Chhikara
 * @date 11-Feb-2019
 *
 */

/**
 * 888. Fair Candy Swap
 * 
 * Alice and Bob have candy bars of different sizes: A[i] is the size of the i-th bar of candy that Alice has, and B[j] is the size of the j-th bar of candy that Bob has.
 * Since they are friends, they would like to exchange one candy bar each so that after the exchange, they both have the same total amount of candy.  
 * (The total amount of candy a person has is the sum of the sizes of candy bars they have.)
 * Return an integer array ans where ans[0] is the size of the candy bar that Alice must exchange, and ans[1] is the size of the candy bar that Bob must exchange.
 * If there are multiple answers, you may return any one of them.  It is guaranteed an answer exists.
 * 
 * Example 1:
 * Input: A = [1,1], B = [2,2]
 * Output: [1,2]
 * 
 * Example 2:
 * Input: A = [1,2], B = [2,3]
 * Output: [1,2]
 * 
 * Example 3:
 * Input: A = [2], B = [1,3]
 * Output: [2,3]
 * 
 * Example 4:
 * Input: A = [1,2,5], B = [2,4]
 * Output: [5,4]
 * 
 * link : https://leetcode.com/problems/fair-candy-swap/
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
