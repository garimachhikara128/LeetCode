package Solution;

import java.util.Scanner;

/**
 * @author Garima Chhikara
 * @date 11-Feb-2019
 *
 */

/**
 * 747. Largest Number At Least Twice of Others
 * 
 * In a given integer array nums, there is always exactly one largest element.
 * Find whether the largest element in the array is at least twice as much as every other number in the array.
 * If it is, return the index of the largest element, otherwise return -1.
 * 
 * Example 1:
 * Input: nums = [3, 6, 1, 0]
 * Output: 1
 * Explanation: 6 is the largest integer, and for every other number in the array x, 6 is more than twice as big as x.  
 * The index of value 6 is 1, so we return 1.
 * 
 * Example 2:
 * Input: nums = [1, 2, 3, 4]
 * Output: -1
 * Explanation: 4 isn't at least as big as twice the value of 3, so we return -1.
 * 
 * link : https://leetcode.com/problems/best-time-to-buy-and-sell-stock/
 */

public class _747_LargestNumberAtLeastTwiceOthers {

	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);

		int n = scn.nextInt();
		int[] arr = new int[n];

		for (int i = 0; i < n; i++) {
			arr[i] = scn.nextInt();
		}

		System.out.println(dominantIndex(arr));

		scn.close();

	}

	public static int dominantIndex(int[] nums) {

		int max = Integer.MIN_VALUE;
		int ans = 0;

		for (int i = 0; i < nums.length; i++) {
			int val = nums[i];
			if (val > max) {
				max = val;
				ans = i;
			}
		}

		boolean flag = true ;
		for (int i = 0; i < nums.length; i++) {

			if (i != ans) {

				if(nums[i] * 2 > max) {
					flag = false ;
					break ;
				}
				
			}
		}
		
		if(flag) {
			return ans ;
		}else{
			return -1 ;
		}

	}

}
