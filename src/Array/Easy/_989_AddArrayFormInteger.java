package Array.Easy;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * @author Garima Chhikara
 * @date 07-Feb-2019
 *
 */

/**
 * 989. Add to Array-Form of Integer
 * 
 * For a non-negative integer X, the array-form of X is an array of its digits in left to right order.  
 * For example, if X = 1231, then the array form is [1,2,3,1].
 * Given the array-form A of a non-negative integer X, return the array-form of the integer X+K.
 * 
 * Example 1:
 * Input: A = [1,2,0,0], K = 34
 * Output: [1,2,3,4]
 * Explanation: 1200 + 34 = 1234
 * 
 * Example 2:
 * Input: A = [2,7,4], K = 181
 * Output: [4,5,5]
 * Explanation: 274 + 181 = 455
 * 
 * Example 3:
 * Input: A = [2,1,5], K = 806
 * Output: [1,0,2,1]
 * Explanation: 215 + 806 = 1021
 * 
 * Example 4:
 * Input: A = [9,9,9,9,9,9,9,9,9,9], K = 1
 * Output: [1,0,0,0,0,0,0,0,0,0,0]
 * Explanation: 9999999999 + 1 = 10000000000
 * 
 * link : https://leetcode.com/problems/add-to-array-form-of-integer/
 *
 */

public class _989_AddArrayFormInteger {

	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);

		int n = scn.nextInt();
		int[] arr = new int[n];

		for (int i = 0; i < n; i++) {
			arr[i] = scn.nextInt();
		}

		int K = scn.nextInt();

		System.out.println(addToArrayForm(arr, K));

		scn.close();

	}

	public static List<Integer> addToArrayForm(int[] A, int K) {

		String B = K + "";

		List<Integer> list = new ArrayList<>();

		int i = A.length - 1;
		int j = B.length() - 1;

		int carry = 0;

		while (i >= 0 || j >= 0) {

			int sum = carry;

			if (i >= 0) {
				sum += A[i];
			}

			if (j >= 0) {
				sum += (B.charAt(j) - '0');
			}

			int rem = sum % 10;
			list.add(rem);

			carry = sum / 10;

			i--;
			j--;
		}

		if (carry != 0) {
			list.add(carry);
		}

		// reverse the list
		int left = 0;
		int right = list.size() - 1;

		while (left <= right) {
			int le = list.get(left);
			int re = list.get(right);

			list.set(left, re);
			list.set(right, le);

			left++;
			right--;
		}
		return list;

	}

}
