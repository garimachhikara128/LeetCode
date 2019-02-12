package Array.Easy;

import java.util.Scanner;

/**
 * @author Garima Chhikara
 * @date 12-Feb-2019
 *
 */

/** 
 * 189. Rotate Array
 * 
 * Given an array, rotate the array to the right by k steps, where k is non-negative.
 * 
 * Example 1:
 * Input: [1,2,3,4,5,6,7] and k = 3
 * Output: [5,6,7,1,2,3,4]
 * Explanation:
 * 		rotate 1 steps to the right: [7,1,2,3,4,5,6]
 * 		rotate 2 steps to the right: [6,7,1,2,3,4,5]
 * 		rotate 3 steps to the right: [5,6,7,1,2,3,4]
 * 
 * Example 2:
 * Input: [-1,-100,3,99] and k = 2
 * Output: [3,99,-1,-100]
 * Explanation: 
 * 		rotate 1 steps to the right: [99,-1,-100,3]
 * 		rotate 2 steps to the right: [3,99,-1,-100]
 * 
 * link : https://leetcode.com/problems/rotate-array/
 */

public class _189_RotateArray {

	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);

		int n = scn.nextInt();
		int[] arr = new int[n];

		for (int i = 0; i < arr.length; i++) {
			arr[i] = scn.nextInt();
		}

		int k = scn.nextInt();
		rotate(arr, k);

		for (int val : arr)
			System.out.print(val + " ");

		System.out.println();

		scn.close();

	}

	public static void rotate(int[] nums, int k) {

		k = k % nums.length;

		for (int r = 1; r <= k; r++) {

			int last = nums[nums.length - 1];

			for (int i = nums.length - 1; i > 0; i--) {
				nums[i] = nums[i - 1];
			}

			nums[0] = last;
		}

	}
}
