package Array.Easy;

import java.util.Scanner;

/**
 * @author Garima Chhikara
 * @date 11-Feb-2019
 *
 */

/**
 * 674. Longest Continuous Increasing Subsequence
 * 
 * Given an unsorted array of integers, find the length of longest continuous increasing subsequence (subarray).
 *  
 * Example 1:
 * Input: [1,3,5,4,7]
 * Output: 3
 * Explanation: The longest continuous increasing subsequence is [1,3,5], its length is 3. 
 * Even though [1,3,5,7] is also an increasing subsequence, it's not a continuous one where 5 and 7 are separated by 4. 
 * 
 * Example 2:
 * Input: [2,2,2,2,2]
 * Output: 1
 * Explanation: The longest continuous increasing subsequence is [2], its length is 1. 
 * 
 * link : https://leetcode.com/problems/longest-continuous-increasing-subsequence/
 */

public class _674_LongestContinuousIncSubsequence {

	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);

		int n = scn.nextInt();
		int[] arr = new int[n];

		for (int i = 0; i < n; i++) {
			arr[i] = scn.nextInt();
		}

		System.out.println(findLengthOfLCIS(arr));

		scn.close();

	}

	public static int findLengthOfLCIS(int[] nums) {
		
		if(nums.length == 0) {
			return 0 ;
		}
		
		int maxCount = 1;
		int presentCount = 1;

		for (int i = 0; i < nums.length - 1; i++) {

			if (nums[i] < nums[i + 1]) {
				presentCount++;

				if (presentCount > maxCount)
					maxCount = presentCount;

			} else {
				presentCount = 1;
			}

		}

		return maxCount;

	}
}
