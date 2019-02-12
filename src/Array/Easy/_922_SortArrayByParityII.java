package Array.Easy;

import java.util.Scanner;

/**
 * @author Garima Chhikara
 * @date 12-Feb-2019
 *
 */

/** 
 * 922. Sort Array By Parity II
 * 
 * Given an array A of non-negative integers, half of the integers in A are odd, and half of the integers are even.
 * Sort the array so that whenever A[i] is odd, i is odd; and whenever A[i] is even, i is even.
 * You may return any answer array that satisfies this condition.
 * 
 * Example 1:
 * Input: [4,2,5,7]
 * Output: [4,5,2,7]
 * Explanation: [4,7,2,5], [2,5,4,7], [2,7,4,5] would also have been accepted.
 * 
 * link : https://leetcode.com/problems/sort-array-by-parity-ii/
 */

public class _922_SortArrayByParityII {

	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);

		int n = scn.nextInt();

		int[] arr = new int[n];

		for (int i = 0; i < n; i++) {
			arr[i] = scn.nextInt();
		}

		int[] ans = sortArrayByParityII(arr);

		for (int val : ans) {
			System.out.println(val);
		}

		scn.close();

	}

	public static int[] sortArrayByParityII(int[] A) {

		int even = 0;
		int odd = 1;

		while (even < A.length && odd < A.length) {

			if (A[even] % 2 == 0) {
				even += 2;
			} else if (A[odd] % 2 != 0) {
				odd += 2;
			} else {
				int temp = A[even];
				A[even] = A[odd];
				A[odd] = temp;

				even += 2;
				odd += 2;
			}

		}

		return A;

	}

}
