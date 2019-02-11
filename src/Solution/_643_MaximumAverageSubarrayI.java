package Solution;

import java.util.Scanner;

/**
 * @author Garima Chhikara
 * @date 07-Feb-2019
 *
 */

/**
 * 643. Maximum Average Subarray I
 * 
 * Given an array consisting of n integers, find the contiguous subarray of given length k that has the maximum average value. 
 * And you need to output the maximum average value.
 * 
 * Example 1:
 * Input: [1,12,-5,-6,50,3], k = 4
 * Output: 12.75
 * Explanation: Maximum average is (12-5-6+50)/4 = 51/4 = 12.75
 * 
 * link : https://leetcode.com/problems/maximum-average-subarray-i/
 */

public class _643_MaximumAverageSubarrayI {

	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);

		int n = scn.nextInt();

		int[] arr = new int[n];

		for (int i = 0; i < n; i++) {
			arr[i] = scn.nextInt();
		}

		int k = scn.nextInt();

		System.out.println(findMaxAverage(arr, k));

		scn.close();
	}

	public static double findMaxAverage(int[] nums, int k) {

		double max = Integer.MIN_VALUE;

		int sum = 0;
		for (int i = 0; i < k; i++) {
			sum += nums[i];
		}

		if (sum > max)
			max = sum;

		for (int i = 1; i <= nums.length - k; i++) {

			sum -= nums[i - 1];
			sum += nums[i + k - 1];

			if (sum > max)
				max = sum;

		}

		return max/k;

	}

}
