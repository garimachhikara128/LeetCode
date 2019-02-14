package Array.Medium;

import java.util.Scanner;

/**
 * @author Garima Chhikara
 * @date 12-Feb-2019
 *
 */

/**
 * 153. Find Minimum in Rotated Sorted Array
 * 
 * Suppose an array sorted in ascending order is rotated at some pivot unknown to you beforehand.
 * (i.e.,  [0,1,2,4,5,6,7] might become  [4,5,6,7,0,1,2]).
 * Find the minimum element.
 * You may assume no duplicate exists in the array.
 * 
 * Example 1:
 * Input: [3,4,5,1,2] 
 * Output: 1
 * 
 * Example 2:
 * Input: [4,5,6,7,0,1,2]
 * Output: 0
 *
 * link : https://leetcode.com/problems/find-minimum-in-rotated-sorted-array/
 */

public class _153_MinimumRotatedSortedArray {

	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);

		int n = scn.nextInt();
		int[] arr = new int[n];

		for (int i = 0; i < n; i++) {
			arr[i] = scn.nextInt();
		}

		System.out.println(findMin(arr));

		scn.close();

	}

	public static int findMin(int[] nums) {

		int lo = 0;
		int hi = nums.length - 1;

		if (nums[lo] <= nums[hi]) {
			return nums[lo];
		}

		while (lo <= hi) {

			int mid = (lo + hi) / 2;

			if (nums[mid - 1] > nums[mid]) {
				return nums[mid];
			}

			if (nums[mid] > nums[mid+1]) {
				return nums[mid+1];
			}

			
			if (nums[mid] > nums[lo]) {
				lo = mid + 1;
			} else if (nums[mid] < nums[lo]) {
				hi = mid ;
			}

		}

		return -1;

	}

}
