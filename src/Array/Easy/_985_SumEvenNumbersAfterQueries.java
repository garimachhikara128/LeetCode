package Array.Easy;

import java.util.Scanner;

/**
 * @author Garima Chhikara
 * @date 12-Feb-2019
 *
 */

/** 
 * 985. Sum of Even Numbers After Queries
 * 
 * We have an array A of integers, and an array queries of queries.
 * For the i-th query val = queries[i][0], index = queries[i][1], we add val to A[index].  
 * Then, the answer to the i-th query is the sum of the even values of A.
 * (Here, the given index = queries[i][1] is a 0-based index, and each query permanently modifies the array A.)
 * Return the answer to all queries.  Your answer array should have answer[i] as the answer to the i-th query.
 * 
 * Example 1:
 * Input: A = [1,2,3,4], queries = [[1,0],[-3,1],[-4,0],[2,3]]
 * Output: [8,6,2,4]
 * Explanation: 
 * At the beginning, the array is [1,2,3,4].
 * After adding 1 to A[0], the array is [2,2,3,4], and the sum of even values is 2 + 2 + 4 = 8.
 * After adding -3 to A[1], the array is [2,-1,3,4], and the sum of even values is 2 + 4 = 6.
 * After adding -4 to A[0], the array is [-2,-1,3,4], and the sum of even values is -2 + 4 = 2.
 * After adding 2 to A[3], the array is [-2,-1,3,6], and the sum of even values is -2 + 6 = 4.
 * 
 * link : https://leetcode.com/problems/sum-of-even-numbers-after-queries/
 */

public class _985_SumEvenNumbersAfterQueries {

	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);

		int n = scn.nextInt();

		int[] arr = new int[n];

		for (int i = 0; i < n; i++) {
			arr[i] = scn.nextInt();
		}

		int r = scn.nextInt();
		int c = scn.nextInt();

		int[][] queries = new int[r][c];

		for (int i = 0; i < r; i++) {
			for (int j = 0; j < c; j++) {
				queries[i][j] = scn.nextInt();
			}
		}

		int[] ans = sumEvenAfterQueries(arr, queries);

		for (int val : ans) {
			System.out.println(val);
		}

		scn.close();

	}

	public static int[] sumEvenAfterQueries(int[] A, int[][] queries) {

		int sum = 0;
		for (int item : A) {
			if (item % 2 == 0) {
				sum += item;
			}
		}

		int[] ans = new int[queries.length];

		for (int q = 0; q < queries.length; q++) {

			int val = queries[q][0];
			int idx = queries[q][1];

			if (A[idx] % 2 == 0)
				sum -= A[idx];

			A[idx] += val;

			if (A[idx] % 2 == 0)
				sum += A[idx];

			ans[q] = sum;

		}

		return ans;

	}
}
