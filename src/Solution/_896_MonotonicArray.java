package Solution;

import java.util.Scanner;

/**
 * @author Garima Chhikara
 * @date 11-Feb-2019
 *
 */

/**
 * 896. Monotonic Array
 * 
 * An array is monotonic if it is either monotone increasing or monotone decreasing.
 * An array A is monotone increasing if for all i <= j, A[i] <= A[j].  
 * An array A is monotone decreasing if for all i <= j, A[i] >= A[j].
 * Return true if and only if the given array A is monotonic.
 * 
 * Example 1:
 * Input: [1,2,2,3]
 * Output: true
 * 
 * Example 2:
 * Input: [6,5,4,4]
 * Output: true
 * 
 * Example 3:
 * Input: [1,3,2]
 * Output: false
 * 
 * Example 4:
 * Input: [1,2,4,5]
 * Output: true
 * 
 * Example 5:
 * Input: [1,1,1]
 * Output: true
 * 
 * link : https://leetcode.com/problems/monotonic-array/
 */

public class _896_MonotonicArray {

	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);

		int n = scn.nextInt();
		int[] arr = new int[n];

		for (int i = 0; i < n; i++) {
			arr[i] = scn.nextInt();
		}

		System.out.println(isMonotonic(arr));

		scn.close();

	}

	public static boolean isMonotonic(int[] A) {
		return isIncreasing(A) || isDecreasing(A);
	}

	public static boolean isIncreasing(int[] A) {

		boolean mi = true;

		for (int i = 0; i < A.length - 1; i++) {

			if (A[i] > A[i + 1]) {
				mi = false;
				break;
			}
		}

		return mi;
	}

	public static boolean isDecreasing(int[] A) {

		boolean md = true;

		for (int i = 0; i < A.length - 1; i++) {

			if (A[i] < A[i + 1]) {
				md = false;
				break;
			}
		}

		return md;

	}
}
