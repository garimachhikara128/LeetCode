package Solution;

import java.util.Scanner;

/**
 * @author Garima Chhikara
 * @date 07-Feb-2019
 *
 */

/**
 * 53. Maximum Subarray
 * 
 * Given an integer array nums, find the contiguous subarray (containing at least one number) which has the largest sum and return its sum.
 * 
 * Example:
 * Input: [-2,1,-3,4,-1,2,1,-5,4]
 * Output: 6
 * Explanation: [4,-1,2,1] has the largest sum = 6.
 * 
 * link : https://leetcode.com/problems/maximum-subarray/
 */

public class _53_MaximumSubarray {

	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);

		int n = scn.nextInt();

		int[] arr = new int[n];

		for (int i = 0; i < n; i++) {
			arr[i] = scn.nextInt();
		}

		System.out.println(maxSubArray(arr));

		scn.close();
	}

	// Kadanes Algorithm
	public static int maxSubArray(int[] nums) {

		int maxTotal = nums[0];
		int maxPrev = nums[0];

		for (int i = 1; i < nums.length; i++) {

			if (nums[i] + maxPrev > nums[i]) {
				maxPrev += nums[i];
			}else {
				maxPrev = nums[i] ;
			}

			if (maxPrev > maxTotal)
				maxTotal = maxPrev;
		}

		return maxTotal;

	}
}
