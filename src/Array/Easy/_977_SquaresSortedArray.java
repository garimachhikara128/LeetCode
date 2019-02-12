package Array.Easy;

import java.util.Scanner;

/**
 * @author Garima Chhikara
 * @date 12-Feb-2019
 *
 */

/** 
 * 977. Squares of a Sorted Array
 * 
 * Given an array of integers A sorted in non-decreasing order, return an array of the squares of each number, also in sorted non-decreasing order.
 * 
 * Example 1:
 * Input: [-4,-1,0,3,10]
 * Output: [0,1,9,16,100]
 * 
 * Example 2:
 * Input: [-7,-3,2,3,11]
 * Output: [4,9,9,49,121]
 * 
 * link : https://leetcode.com/problems/squares-of-a-sorted-array/
 */

public class _977_SquaresSortedArray {

	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);

		int n = scn.nextInt();

		int[] arr = new int[n];

		for (int i = 0; i < n; i++) {
			arr[i] = scn.nextInt();
		}

		int[] ans = sortedSquares(arr);

		for (int val : ans) {
			System.out.println(val);
		}

		scn.close();

	}

	public static int[] sortedSquares(int[] A) {

		int c = -1;

		for (int i = 0; i < A.length; i++) {
			if (A[i] < 0) {
				c = i;
			}
		}

		int[] ans = new int[A.length];
		int k = 0;

		int left = c;
		int right = c + 1;

		while (left >= 0 && right < A.length) {

			int lm = A[left] * A[left];
			int rm = A[right] * A[right];

			ans[k] = Math.min(lm, rm);

			if (ans[k] == lm) {
				left--;
			} else {
				right++;
			}

			k++;
		}

		while (right < A.length) {

			ans[k] = A[right] * A[right];
			k++;
			right++;
		}

		while (left >= 0) {

			ans[k] = A[left] * A[left];
			k++;
			left--;
		}

		return ans;
	}
}
