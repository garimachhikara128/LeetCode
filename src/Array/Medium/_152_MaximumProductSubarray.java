package Array.Medium;

import java.util.Scanner;

/**
 * @author Garima Chhikara
 * @date 12-Feb-2019
 *
 */

/**
 * 152. Maximum Product Subarray
 * 
 * Given an integer array nums, find the contiguous subarray within an array (containing at least one number) which has the largest product.
 * 
 * Example 1:
 * Input: [2,3,-2,4]
 * Output: 6
 * Explanation: [2,3] has the largest product 6.
 * 
 * Example 2:
 * Input: [-2,0,-1]
 * Output: 0
 * Explanation: The result cannot be 2, because [-2,-1] is not a subarray.
 * 
 * link : https://leetcode.com/problems/maximum-product-subarray/
 */

public class _152_MaximumProductSubarray {

	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);

		int n = scn.nextInt();
		int[] arr = new int[n];

		for (int i = 0; i < n; i++) {
			arr[i] = scn.nextInt();
		}

		System.out.println(maxProduct(arr));

		scn.close();

	}

	public static int maxProduct(int[] nums) {

		int maxTillNow = Integer.MIN_VALUE;
		int maxPresent = 1;
		int minPresent = 1;

		for (int i = 0; i < nums.length; i++) {

			if (nums[i] < 0) {
				int temp = maxPresent;
				maxPresent = minPresent;
				minPresent = temp;
			}

			maxPresent = Math.max(nums[i], maxPresent * nums[i]);
			minPresent = Math.min(nums[i], minPresent * nums[i]);

			maxTillNow = Math.max(maxTillNow, Math.max(minPresent, maxPresent));

		}

		return maxTillNow;

	}

	public static int maxProduct_A2(int[] nums) {

		if(nums.length == 1) {
			return nums[0] ;
		}
		
		int maxTotal = nums[0];

		int maxPresent = nums[0];
		int minPresent = nums[0];

		for (int i = 1; i < nums.length; i++) {

			int a = maxPresent * nums[i];
			int b = minPresent * nums[i];

			maxPresent = Math.max(nums[i], Math.max(a, b));
			minPresent = Math.min(nums[i], Math.min(a, b));

			maxTotal = Math.max(maxTotal, Math.max(minPresent, maxPresent));

		}

		return maxTotal;

	}

}
