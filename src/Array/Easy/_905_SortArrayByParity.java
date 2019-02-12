package Array.Easy;

import java.util.Scanner;

/**
 * @author Garima Chhikara
 * @date 12-Feb-2019
 *
 */

/** 
 * 905. Sort Array By Parity
 * 
 * Given an array A of non-negative integers, return an array consisting of all the even elements of A, followed by all the odd elements of A.
 * You may return any answer array that satisfies this condition.
 * 
 * Example 1:
 * Input: [3,1,2,4]
 * Output: [2,4,3,1]
 * The outputs [4,2,3,1], [2,4,1,3], and [4,2,1,3] would also be accepted.
 * 
 * link : https://leetcode.com/problems/sort-array-by-parity/
 */

public class _905_SortArrayByParity {

	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);

		int n = scn.nextInt();

		int[] arr = new int[n];

		for (int i = 0; i < n; i++) {
			arr[i] = scn.nextInt();
		}

		int[] ans = sortArrayByParity(arr);

		for (int val : ans) {
			System.out.println(val);
		}

		scn.close();

	}

	public static int[] sortArrayByParity(int[] A) {

		int left = 0;
		int right = A.length - 1;

		while (left <= right) {

			if (A[left] % 2 == 0) {
				left++;
			} else if (A[right] % 2 != 0) {
				right--;
			} else {
				int temp = A[left];
				A[left] = A[right];
				A[right] = temp;

				left++;
				right--;
			}

		}
		
		return A ;

	}

}
