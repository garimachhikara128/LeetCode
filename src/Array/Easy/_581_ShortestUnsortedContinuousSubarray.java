package Array.Easy;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @author Garima Chhikara
 * @date 12-Feb-2019
 *
 */

/** 
 * 581. Shortest Unsorted Continuous Subarray
 * 
 * Given an integer array, you need to find one continuous subarray that if you only sort this subarray in ascending order, then the whole array will be sorted in ascending order, too.
 * You need to find the shortest such subarray and output its length.
 * 
 * Example 1:
 * Input: [2, 6, 4, 8, 10, 9, 15]
 * Output: 5
 * Explanation: You need to sort [6, 4, 8, 10, 9] in ascending order to make the whole array sorted in ascending order.
 *  
 * link : https://leetcode.com/problems/shortest-unsorted-continuous-subarray/
 */

public class _581_ShortestUnsortedContinuousSubarray {

	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);

		int n = scn.nextInt();
		int[] arr = new int[n];

		for (int i = 0; i < arr.length; i++) {
			arr[i] = scn.nextInt();
		}

		System.out.println(findUnsortedSubarray(arr));

		scn.close();

	}

	// O(nlogn) approach
	public static int findUnsortedSubarray(int[] nums) {

		int[] sorted = nums.clone();
		Arrays.sort(sorted);

		int si = -1;
		for (int i = 0; i < nums.length; i++) {

			if (sorted[i] != nums[i]) {
				si = i;
				break;
			}
		}

		int ei = -1;
		for (int i = nums.length - 1; i >= 0; i--) {

			if (sorted[i] != nums[i]) {
				ei = i;
				break;
			}
		}

		if (si == -1 && ei == -1) {
			return 0;
		}

		return ei - si + 1;
	}

	// O(n)
	public static int findUnsortedSubarray_A2(int[] nums) {

		int ei = -1;
		int max = Integer.MIN_VALUE;

		for (int i = 0; i < nums.length; i++) {

			if (nums[i] > max) {
				max = nums[i];
			} else {
				ei = i;
			}
		}

		int si = -1;
		int min = Integer.MAX_VALUE;

		for (int i = nums.length - 1; i >= 0; i--) {

			if (nums[i] < min) {
				min = nums[i];
			} else {
				si = i;
			}
		}

		if (si == -1 && ei == -1) {
			return 0;
		}

		return ei - si + 1;
	}

}