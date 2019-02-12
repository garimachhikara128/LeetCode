package Array.Easy;

import java.util.Scanner;

/**
 * @author Garima Chhikara
 * @date 07-Feb-2019
 *
 */

/**
 * 941. Valid Mountain Array
 * 
 * Given an array A of integers, return true if and only if it is a valid mountain array.
 * Recall that A is a mountain array if and only if:
 * A.length >= 3
 * There exists some i with 0 < i < A.length - 1 such that:
 * 		A[0] < A[1] < ... A[i-1] < A[i]
 * 		A[i] > A[i+1] > ... > A[B.length - 1]
 * 
 * Example 1:	Input: [2,1]		Output: false
 * Example 2:	Input: [3,5,5]		Output: false
 * Example 3:	Input: [0,3,2,1]	Output: true
 *  
 * link : https://leetcode.com/problems/valid-mountain-array/
 */

public class _941_ValidMountainArray {

	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);

		int n = scn.nextInt();

		int[] arr = new int[n];

		for (int i = 0; i < n; i++) {
			arr[i] = scn.nextInt();
		}

		System.out.println(validMountainArray_A1(arr));

		scn.close();

	}

	// Time Complexity : O(n)
	// Space Complexity : O(1)
	public static boolean validMountainArray_A1(int[] A) {

		// climb up
		int i = 0;

		while (i < A.length && A[i] < A[i + 1]) {
			i++;
		}

		if (i == 0 || i == A.length) {
			return false;
		}

		// go down
		while (i < A.length - 1 && A[i] > A[i + 1]) {
			i++;
		}

		return i == A.length;
	}

	// Time Complexity : O(n)
	// Space Complexity : O(1)
	public static boolean validMountainArray_A2(int[] A) {

		if (A.length <= 2) {
			return false;
		}

		boolean goingUp = true;

		for (int i = 0; i < A.length - 1; i++) {

			if (goingUp == true) {
				if (A[i] < A[i + 1]) {
					// ok
				} else if (A[i] > A[i + 1]) {
					goingUp = false;
				} else {
					return false;
				}
			} else {

				if (A[i] > A[i + 1]) {
					// ok
				} else if (A[i] < A[i + 1]) {
					return false;
				} else {
					return false;
				}
			}

		}

		// check full increasing
		boolean flag = false;
		for (int i = 0; i < A.length - 1; i++) {

			if (A[i] > A[i + 1]) {
				flag = true;
			}
		}

		if (!flag) {
			return false;
		}

		// check full decreasing
		flag = false;
		for (int i = 0; i < A.length - 1; i++) {

			if (A[i] < A[i + 1]) {
				flag = true;
			}
		}

		if (!flag) {
			return false;
		}

		return true;
	}

}
