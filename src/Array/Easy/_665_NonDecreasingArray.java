package Array.Easy;

import java.util.Scanner;

/**
 * @author Garima Chhikara
 * @date 07-Feb-2019
 *
 */

/** 
 * 665. Non-decreasing Array
 * 
 * Given an array with n integers, your task is to check if it could become non-decreasing by modifying at most 1 element.
 * We define an array is non-decreasing if array[i] <= array[i + 1] holds for every i (1 <= i < n).
 *  
 * Example 1:
 * Input: [4,2,3]
 * Output: True
 * Explanation: You could modify the first 4 to 1 to get a non-decreasing array.
 *  
 * Example 2:
 * Input: [4,2,1]
 * Output: False
 * Explanation: You can't get a non-decreasing array by modify at most one element.
 * 
 * link : https://leetcode.com/problems/non-decreasing-array/
 */

public class _665_NonDecreasingArray {

	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();

		int[] arr = new int[n];

		for (int i = 0; i < n; i++) {
			arr[i] = scn.nextInt();
		}

		System.out.println(checkPossibility(arr));

		scn.close();
	}

	public static boolean checkPossibility(int[] nums) {

		int c = -1;

		for (int i = 0; i < nums.length - 1; i++) {

			if (nums[i] > nums[i + 1]) {

				if (c != -1)
					return false; // more than one points exist

				c = i;

			}

		}

		return c == -1 || c == 0 || c == nums.length - 2 || nums[c - 1] <= nums[c + 1] || nums[c] <= nums[c + 2];
	}

}
